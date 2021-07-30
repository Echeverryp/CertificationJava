package com.java.certification.questions.Hilos;

public class SincronizandoHilos {

    public static void main(String[] args) {

        HilosVarios hilo1=new HilosVarios();

        HilosVarios hilo2=new HilosVarios();

        hilo1.start();

        //JOIN HACE QUE HASTA QUE NO MUERA ESTE HILO, NO PUEDE SEGUIR CON EL OTRO -- ALGO SIMILAR AL WAIT DE REACT
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo2.start();

        //HASTA QUE NO TERMINE CON EL HILO DOS, NO CONTINUA CON EL SYSTEM OUT PRINTLN
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
