package com.java.certification.programacionFuncional.interfaesJDK;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.List;

public class MainPartitioningBy {

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


    }
}
