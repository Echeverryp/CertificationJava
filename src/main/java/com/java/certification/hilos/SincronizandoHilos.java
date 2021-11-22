package com.java.certification.hilos;

public class SincronizandoHilos {

    public static void main(String[] args) {
        HilosVarios h1=new HilosVarios();
        HilosVarios2 h2=new HilosVarios2(h1);
        h2.start();

        System.out.println("After");
    }
}

class HilosVarios extends Thread{

    public void run(){
        for (int i=0; i<15;i++){
            System.out.println("Ejecutando Hilo" + i + " " + getName());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HilosVarios2 extends Thread{

    private Thread hilo;

    public HilosVarios2(Thread hilo){
        this.hilo=hilo;

    }

    public void run(){

        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0; i<15;i++){
            System.out.println("Ejecutando Hilo" + i + " " + getName());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
