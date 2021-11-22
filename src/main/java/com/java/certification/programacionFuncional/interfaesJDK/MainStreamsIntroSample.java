package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStreamsIntroSample {

    private static final String PATH="";
    public static void main(String[] args) {

        var listOfPersons= List.of("Uno","Dos","Tres","Cuatro","Cinco");

        listOfPersons.forEach(System.out::println);
        System.out.println("-------------------------------------");
        var arrayData=listOfPersons.toArray();
        //LOS ARREGLOS NO TIENEN EL FOR EACH CON EL STREAM IMPLICITO,
        // POR ESO SE USA LA CLASE ARRAYS AS LIST O SE PUEDE USAR EL STREAM OF
        Arrays.asList(arrayData).forEach(System.out::println);
        System.out.println("-------------------------------------");
        Stream.of(arrayData).forEach(a->System.out.println(a));
        System.out.println("-------------------------------------");
        Arrays.stream(arrayData).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //**TIPOS PRIMITIVOS**//
        //int,double,long
        System.out.println("-------------------------------------");

        double[] doubleArray=new double[]{1.2,1.3,1.4,1.5};
        Arrays.stream(doubleArray).forEach(System.out::println);
        DoubleStream.of(1.2,1.3).forEach(System.out::println);

        System.out.println("-------------------------------------");

        IntUnaryOperator operatorInfinitive = intValue->intValue+1;
        IntConsumer intAction=System.out::println;
        IntStream.iterate(0,operatorInfinitive).forEach(intAction);

        IntUnaryOperator operatorFinite=intValue->intValue<=1000 ? intValue +1 :null;

        //TakeWhile es una condicional para , parar un ciclo infinito (aca se esta llendo de 1 hasta 1000
        //cuando llega a 1000 para
        IntStream.iterate(0,operatorFinite).takeWhile(intValue->intValue<=100).forEach(System.out::println);

        //No incluye el 1000
        IntStream.range(0,1000).forEach(System.out::println);

        //Incluye el 1000
        IntStream.rangeClosed(0,1000).forEach(System.out::println);


    }
}
