package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStreamSample {

    public static void main(String[] args) {
        List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4));

        //lst.forEach(System.out::println);


        List<Pet> lstNew= new ArrayList<>();

        //Recorre la lista sin repetir elementos y los agrega a la otra lista
        lst.stream().distinct().forEach(a-> lstNew.add(a));

        lstNew.forEach(System.out::println);
        System.out.println("------------FILTER-------------");
        //EL PEEK HACE UNA ESPECIE DE PINTADO PARA VER LA INFORMACION ANTE DE PROSEGUIR
        var count = lst.stream().filter(a->a.getAge()>10).peek(System.out::println).
                filter(a->a.getName().startsWith("T")).count();


        System.out.println(count);


    }
}
