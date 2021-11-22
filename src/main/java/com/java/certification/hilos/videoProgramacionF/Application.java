package com.java.certification.hilos.videoProgramacionF;

import java.util.stream.LongStream;

public class Application {

    public static void main(String[] args) {

        var threadThatInherits=new ExampleOfThread("// Hereda de thread e implementa el metodo run");
        threadThatInherits.start();


        var threadImplements=new Thread(new OtherExampleOfThread(),"Utiliza un Runnable Externo");
        threadImplements.start();

        var threadWithLambda=new Thread(()->System.out.println("Ha finalizado la suma del hilo " + Thread.currentThread().getName() + " : " +
                LongStream.rangeClosed(0,10).sum()),"Utilizando lambda expresion");
        threadWithLambda.start();

    }

    public static class ExampleOfThread extends Thread{

        public ExampleOfThread(String name){
            setName(name);
        }

        @Override
        public void run() {
            System.out.println("Ha finalizado la suma del hilo " + getName() + " : " +
                    LongStream.rangeClosed(0,10).sum());
        }
    }


    public static class OtherExampleOfThread implements Runnable{
        @Override
        public void run() {
            System.out.println("Ha finalizado la suma del hilo " + Thread.currentThread().getName() + " : " +
                    LongStream.rangeClosed(0,10).sum());
        }
    }


}
