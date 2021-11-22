package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class InitRecoolect {

    public static void main(String[] args) {
        List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4));

        IntFunction<String[]> generator=String[]::new;
        ///IntFunction<String[]> generator=size->new String[size+size];
        String[] arr= lst.stream().map(Pet::getName).distinct().toArray(generator);
        System.out.println(Arrays.toString(arr));


    }
}
