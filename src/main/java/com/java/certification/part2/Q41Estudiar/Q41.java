package com.java.certification.part2.Q41Estudiar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q41 {
    public static void main(String[] args) {

        Integer[] intArray = {2,1,3,4,5};
        List<Integer> list = new ArrayList<>(Arrays.asList(intArray));
        //IMPRIME EL ARREGLO EN EL ORDEN QUE AGREGO
       // list.parallelStream().forEachOrdered(e -> System.out.print(e + " "));
        //IMPRIME EL ARREGLO DE FORMA ALEATORIA
        list.parallelStream().forEach(e -> System.out.print(e + " "));

        list.stream().forEach(System.out::println);
    }
}

/*
https://docs.oracle.com/javase/tutorial/collections/streams/parallelism.html


 */
