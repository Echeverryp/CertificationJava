package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExamples {

    static List<Object> lst=new ArrayList<>(); 
    public static void main(String[] args) {
        
        //ACEPTA VALORES Y NO DEVUELVE NADA
        
        lst.add("Hello bros");
        lst.add(2020);
        lst.add(true);
        lst.add(48.88f);

        //usingConsumer("Hola soy un valor de tipo T",System.out::println
        //,v->lst.add(v),ConsumerExamples::printLst);

        usingBiConsumer(4,1000,
                (e,v)->System.out.println("En el index: " + e + " Se intenta añadir el elemento " + v)
                ,(i,v) ->lst.add(i,v)
                ,ConsumerExamples::printAfter
                );
        
    }

    private static void printAfter(Integer e, Integer v) {
        System.out.println("En el index: " + e + " Se intenta añadir el elemento " + v);
        lst.forEach(System.out::println);
    }


    private static <T,U>void usingBiConsumer(T oneValue, U otherValue, BiConsumer<T,U> biConsumer,
    BiConsumer<T,U> biConsumer2,BiConsumer<T,U> biConsumer3) {
        biConsumer.andThen(biConsumer2).andThen(biConsumer3).accept(oneValue,otherValue);
    }

    private static <T> void printLst(T value){
        System.out.println("Se añadio a la lista el valor " + value + " -- total de valores en la " +
                "lista : " + "" );
        lst.forEach(System.out::println);
    }

    private static <T> void usingConsumer(T value, Consumer<T> consumer,
                                          Consumer<T> consumer2, Consumer<T> consumer3) {
        /*consumer.accept(value);
        consumer2.accept(value);
        consumer3.accept(value);*/
        var consumerCompleted = consumer.andThen(consumer2).andThen(consumer3);
        consumerCompleted.accept(value);
    }
}
