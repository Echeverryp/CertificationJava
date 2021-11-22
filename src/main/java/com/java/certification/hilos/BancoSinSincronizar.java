package com.java.certification.hilos;

import com.java.certification.part2.Q3.T;
import com.java.certification.questions.Q37.B;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {


    public static void main(String[] args) {
        Banco banco=new Banco();

        for (int i = 0; i < 100; i++) {
            EjecucionTransferencias ejecucionTransferencias=new EjecucionTransferencias(banco,i, 20);
            Thread thread=new Thread(ejecucionTransferencias);
            thread.start();
        }
    }
}

class Banco{

    public Banco(){
        cuentas=new int[100];

        for (int i =0; i<cuentas.length; i ++){
            cuentas[i]=20;
        }

      //  saldoSuficiente=cierreBanco.newCondition();
    }
    public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, int cantidad) throws InterruptedException {

       // cierreBanco.lock();

       // try {


            while (cuentas[cuentaOrigen] < cantidad) {
               //saldoSuficiente.await();
                wait();
            }
            System.out.println(" ** HILO ** " + Thread.currentThread());
            cuentas[cuentaOrigen] -= cantidad;

            System.out.printf(" ** CANTIDAD " + cantidad + " CUENTA ORIGEN " +
                    cuentaOrigen + " CUENTA DESTINO " + cuentaDestino);

            cuentas[cuentaDestino] += cantidad;

            System.out.println("**SALDO TOTAL** " + getSaldoTotal());
            notifyAll();
            //saldoSuficiente.signalAll();
        //}
        /*finally {
            cierreBanco.unlock();
        }*/
    }

    public int getSaldoTotal(){
        int sumaCuentas=0;

        for (int num: cuentas
             ) {
            sumaCuentas+=num;
        }

        return sumaCuentas;
    }
    private final int [] cuentas;

    //private Lock cierreBanco=new ReentrantLock();

   // private Condition saldoSuficiente;


}

class EjecucionTransferencias implements Runnable{

    public EjecucionTransferencias(Banco b , int de , int max){
        this.banco=b;
        this.deLaCuenta=de;
        this.cantidadMax=max;

    }

    @Override
    public void run() {

        try {
            while (true) {

                int paraLaCuenta = (int) (100 * Math.random());
                int cantidad = (int) (cantidadMax * Math.random());

                banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);


                    Thread.sleep(700);

            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    private Banco banco;
    private int deLaCuenta;
    private int cantidadMax;
}