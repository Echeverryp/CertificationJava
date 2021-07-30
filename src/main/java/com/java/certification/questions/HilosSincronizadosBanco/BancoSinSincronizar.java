package com.java.certification.questions.HilosSincronizadosBanco;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

    public static void main(String[] args) {
        Banco b=new Banco();
        for (int i = 0; i <100 ; i++) {

            Banco.EjecucionTransferencia r=new Banco.EjecucionTransferencia(b,i,2000);

            Thread thread=new Thread(r);
            thread.start();

            
        }

    }
}

class Banco{

    private final double[] cuentas;

    //Instancia que permite bloquear los hilos
    private Lock cierreBanco=new ReentrantLock();
    //Condicion para bloquear o desbloquear
    private Condition saldoSuficiente;

    public Banco() {
        this.cuentas = new double[100];

        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i]=2000;
        }
        //Cada vez que creamos un banco ese banco ya va con una condicion
        //this.saldoSuficiente= cierreBanco.newCondition();
    }

    //La limitacion con el syncronized es que solo se puede usar una vez la condicción, como el wait
    //Al agregar el syncronized , se evita usar el condition y el lock y el await
    public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
        //Cuando un hilo llama este metodo lo bloquea para que el hilo que venga atras no pueda acceder hasta que se desbloquee
        //cierreBanco.lock();

        //try {
        while(cuentas[cuentaOrigen]<cantidad) {

            //Si la condicion de arriba es verdad, el hilo estara a la espera
            //this.saldoSuficiente.await();
            wait();
        }

            System.out.println(Thread.currentThread());
            cuentas[cuentaOrigen] -= cantidad; //Dinero que sale de la cuenta origen

            System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);

            cuentas[cuentaDestino] += cantidad;

            System.out.printf(" Saldo Total: %10.2f%n", getSaldoTotal());

            //Informa a los hilos que estaban a la espera que ya pueden ejecutarse, hace lo mismo que el de abajo pero sin tanto codigo
            notifyAll();

            //Les avisa a los hilos que esten a la espera que ya pueden valida si la condicion de arriba se cumple para que
            //realicen su tarea
            //this.saldoSuficiente.signalAll();


        //} //catch (InterruptedException e) {
            //e.printStackTrace();
        /*}finally {
            cierreBanco.unlock();
        }*/
    }

    public double getSaldoTotal(){
        double sumaTotal=0;
        for (double arregloCuentas: cuentas
             ) {
            sumaTotal+=arregloCuentas;
        }

        return sumaTotal;
    }


    static class EjecucionTransferencia implements Runnable{

        private Banco banco;
        private  int deLaCuenta;
        private double cantidadMax;


        public EjecucionTransferencia(Banco banco, int de,double max){
        this.banco=banco;
        this.deLaCuenta=de;
        this.cantidadMax=max;

        }

        @Override
        public void run() {

            while(true){

                    int paraLaCuenta= (int) (100*Math.random());
                    double  cantidad= cantidadMax*Math.random();
                try {
                    banco.transferencia(deLaCuenta, paraLaCuenta,cantidad);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep((int)(Math.random()*10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
