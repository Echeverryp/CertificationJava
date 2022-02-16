package com.java.certification.programacionFuncional.interfaesJDK;

import com.google.gson.GsonBuilder;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectToMap {
    static    List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4));

    public static void main(String[] args) {


        //simple();
        merge();
       // mergeSupp();
        //grouping();
    }

    private static void simple() {
        //Clave->Pet Value ->Su Json
        var gsonObject= new GsonBuilder().setPrettyPrinting().create();
        Map<Pet, String > map= lst.stream().limit(2).collect(Collectors.toMap(pet->pet,pet->gsonObject.toJson(pet)));

        System.out.println(map);
    }
    private static void merge() {

        //Clave->Gender Valor ->List<Pet>


        Function<Pet,List<Pet>> valueMap=pet -> {
            var lst=new ArrayList<Pet>();
            System.out.println("VALUE MAP");

            //lst.add(new Pet("New",12));
            lst.add(pet);
            System.out.println(pet.getName());
            return lst;
        };

        BinaryOperator<List<Pet>> merge=(lst,lst2)->{

            System.out.println("****MERGE[***");
            System.out.println("Primera Lista lista");
            lst.forEach(System.out::println);
            System.out.println("Segunda lista");
            lst2.forEach(System.out::println);
            lst2.addAll(lst);
            return lst2;
        };

        Map<String,List<Pet>> map=lst.stream().collect(Collectors.toMap(Pet::getName,valueMap,merge));
       // System.out.println(map);
        System.out.println("*******");
        map.entrySet().stream().forEach(p-> System.out.println("Key: "+p.getKey() + "\n Value: " + p.getValue()) );
    }
    private static void mergeSupp() {
        Map<String,List<Pet>> map=lst.stream().collect(Collectors.groupingBy(Pet::getName));
        System.out.println(map);
    }
    private static void grouping() {

        Function<Pet,List<Pet>> valueMap=pet -> {
            var lst=new ArrayList<Pet>();
            lst.add(pet);
            return lst;
        };
        BinaryOperator<List<Pet>> merge=(lst,lst2)->{
            lst2.addAll(lst);
            return lst2;
        };

        Supplier<Map<String,List<Pet>>>  supplier=()->new EnumMap(String.class);

        Map<String,List<Pet>> map=lst.stream().collect(Collectors.toMap(Pet::getName,valueMap,merge,supplier));
        System.out.println(map);
    }
}
