package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapSample {

    public static void main(String[] args) {
        List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4));

        lst.stream().
                map(Pet::getAge).
                distinct()
                .forEach(System.out::println);


        lst.stream().
                mapToInt(Pet::getAge).
                distinct()
                .forEach(System.out::println);
        var lstComplete=new ArrayList<List<Pet>> ();

        //DEVUELVE EL STREAM DE PETS
        Stream<Pet> streamPetsFlatMap= lstComplete.stream().
                flatMap(List::stream);
        //DEVUELVE UN STREAM DE STREAMS
        Stream<Stream<Pet>> streamPetsMap= lstComplete.stream().
                map(List::stream);
        System.out.println("*****");
        streamPetsFlatMap.
                mapToDouble(Pet::getAge).distinct().
                forEach(System.out::println);



    }
}
