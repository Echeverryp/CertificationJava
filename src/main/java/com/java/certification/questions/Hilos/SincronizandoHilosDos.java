package com.java.certification.questions.Hilos;

public class SincronizandoHilosDos {

    public static void main(String[] args) {

        HilosVarios hilo1=new HilosVarios();

        HilosVariosDos hilo2=new HilosVariosDos(hilo1);

        hilo2.start();
        hilo1.start();

        System.out.println("Terminadas las tareas");
    }

    static class HilosVarios extends Thread{
        public void run(){
            for (int i = 0; i < 15; i++) {
                System.out.println("Ejecutando Hilo"+ getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class HilosVariosDos extends Thread{

        //SE PASA POR PARAMETRO EL HILO QUE TIENE QUE ESPERAR
        //REVISAR EL CONSTRUCTOR QUE ES DONDE SE MANDA EL HILO Y EL METODO RUN EN DONDE SE PONE EL JOIN

        public HilosVariosDos(Thread hilo){

            this.thread=hilo;
        }
        public void run(){

            try {
                this.thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 15; i++) {
                System.out.println("Ejecutando Hilo"+ getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private Thread thread;
    }
}
