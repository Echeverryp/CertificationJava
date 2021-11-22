package com.java.certification.programacionFuncional.interfaesJDK;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.concurrent.*;

public class MainIFEExamples {

    public static void main(String[] args) {

        /*
        * Callable<T>
        * Runnable
        * ActionListener
        * Predicate<T>
        * Supplier<T>
        * Consumer<T>
        * Function<T,R>
        * BiFunction<T,R>
        * Comparator<T>
        * comparatorExample();
        * runnableExample();
        * callableExample();
        * actionListenerExample();
        * */

        //actionListenerExample();
        //callableExample();
        //runnableExample();
        comparatorExample();
    }

    private static void comparatorExample(){
        var tree=new TreeSet<>(MainIFEExamples::compare);
        tree.add(4);
        tree.add(9);
        tree.add(8);
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(9);
        tree.forEach(System.out::println);

    }
    private static int compare (Integer a , Integer b){
        //1 lo incluye , 0 no lo incluye
        if(a<b){
            return 1;
        }
        if(a==b){
            return 0;
        }
        return -1;
    }

    private static void runnableExample() {
        var thread=new Thread(MainIFEExamples::runBehavior);
        thread.start();
    }

    private static void runBehavior(){
        var i=0;
        while(i++ !=100){
            System.out.println("llamada a run() No " + i);
        }
    }

    private static void callableExample() {

        try {
            ExecutorService executor= Executors.newSingleThreadExecutor();
            Future<String> future= executor.submit(MainIFEExamples::operation);
            System.out.println("Resultado : " + future.get());
            /*if(future.isDone()){
                System.out.println(future.get());
            }*/
            executor.shutdown();

        }catch (InterruptedException | ExecutionException e){

        }
    }

    private static String operation() {
        Character[] charArray=new Character[]{'S','o','y',' ', 'u','n','a',' ','c','a','d','e','n','a'};
        var bffer=new StringBuilder("Recomponiendo cadena-> ");
        Arrays.stream(charArray).forEach(character -> {
            System.out.println(character);
            bffer.append(character);
            sleep();
        });
        System.out.println(Thread.currentThread().getName());
        return bffer.toString();
    }

    private static void sleep(){
        try{
            Thread.sleep(1000);
            System.out.println("Un segundo despues..");
        }catch (InterruptedException e){
                e.printStackTrace();
        }
    }

    public static void actionListenerExample(){
        var frame= new JFrame();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        var btn=new JButton("EXIT");
        btn.setSize(frame.getSize());


        btn.addActionListener(event->System.exit(0));
        frame.getContentPane().add(btn);
        frame.setVisible(true);

    }
}
