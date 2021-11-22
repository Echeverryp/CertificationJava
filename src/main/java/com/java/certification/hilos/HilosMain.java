package com.java.certification.hilos;

public class HilosMain {

    public static void main(String[] args) {
        Hilo1 h1=new Hilo1();

        Hilo2 h2=new Hilo2();
        Hilo3 h3=new Hilo3();
        Hilo4 h4=new Hilo4();
        try {
        h1.start();
            Thread.sleep(10);
        h2.start();
            Thread.sleep(10);

        h3.start();
            Thread.sleep(10);

        h4.start();
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
