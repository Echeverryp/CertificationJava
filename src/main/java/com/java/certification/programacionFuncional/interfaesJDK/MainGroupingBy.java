package com.java.certification.programacionFuncional.interfaesJDK;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainGroupingBy {
    static List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4));
    private static Gson gsonConverter;
    public static void main(String[] args) {
        gsonConverter=new GsonBuilder().setPrettyPrinting().create();

        //lst.stream().map(gsonConverter::toJson).forEach(System.out::println);

        //groupinBySimple().entrySet().forEach(System.out::println);

        //groupinByMedium().entrySet().forEach(System.out::println);

        groupinByComplete().entrySet().forEach(System.out::println);

        groupinByComplex();
    }

    private static Map<Integer,String> groupinByComplex() {
        Function<Pet,Integer> classifier =pet->{
            return pet.getAge()>10 ? 5 :1;
        };
        Collector<Pet, ?, String> downstream=Collectors.mapping(Pet::getName,Collectors.joining(","));
        return lst.stream().collect(Collectors.groupingBy(classifier,downstream));

    }

    private static Map<String, Set<Pet>> groupinByComplete() {

        return lst.stream().collect(Collectors.groupingBy(Pet::getName, LinkedHashMap::new,Collectors.toSet()));
    }

    private static Map<String,List<Pet>> groupinBySimple() {
        return lst.stream().collect(Collectors.groupingBy(Pet::getName));
    }

    private static Map<? super Pet, Long> groupinByMedium() {
        return lst.stream().collect(Collectors.groupingBy(Pet::getClass,Collectors.counting()));
    }
}
