package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class MainReduce {

    private static Set<String> setOfThread=new HashSet<>();

    public static void main(String[] args) {
        List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4));

        System.out.println("Reduce Simple"+lst.stream().map(prod->prod.getName().concat(" // ")).distinct()
        .reduce("Tipos de Materiales: ",String::concat));

        System.out.println("Reduce Optional: "+lst.stream().map(prod->prod.getName().concat(" // ")).distinct()
                .reduce(String::concat).get());

        BiFunction<Integer,Integer, Integer> acumulator=(sum,num)->{

            var location="acumulador";
            var threadName= Thread.currentThread().getName();
            setOfThread.add(threadName);
            System.out.println(location + " : " + threadName + " //sum-> "+ sum);
            System.out.println(location + " : " + threadName + " //num-> "+ num);
            return (sum+num) *2;
        };
        BinaryOperator<Integer> combiner=(sum,sum1)->{

            var location="combinar";
            var threadName= Thread.currentThread().getName();
            setOfThread.add(threadName);
            System.out.println(location + " : " + threadName + " //sum-> "+ sum);
            System.out.println(location + " : " + threadName + " //num-> "+ sum1);
            return sum+sum1;
        };

        var result= Stream.of(1,2,3,4,12,13,15,15).parallel().reduce(0,acumulator,combiner);

        System.out.println("["+result+"]");
        resultSeq();
        System.out.println(setOfThread.size());
    }

    private static void resultSeq(){
        System.out.println(Stream.of(1,2,3,4,12,13,15,15).map(number->number*2).reduce(Integer::sum).get());
    }
}
