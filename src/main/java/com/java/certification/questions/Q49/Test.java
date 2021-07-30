package com.java.certification.questions.Q49;

import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newCachedThreadPool();
        es.execute(()->System.out.println("Ping"));

        Future<String> future=es.submit(()->"Pong");

        /*Future<String> future1=new Callable<String>(){

            @Override
            public String call() throws Exception {
                return "Pong";
            }
        }.call();*/

        /*Future<String> future1=es.invokeAny(new Callable<String>(){

            @Override
            public String call() throws Exception {
                return null;
            }
        });*/

        System.out.println(future.get());
        es.shutdown();
    }
}
