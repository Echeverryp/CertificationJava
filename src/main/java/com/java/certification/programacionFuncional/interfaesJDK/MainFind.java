package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainFind {
    public static void main(String[] args) {


        List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4));
        Predicate<Pet> predicate= (p)->p.getAge()>10;


        System.out.println(lst.stream().filter(predicate).filter(p->p.getName().contains("T")).map(Pet::getName).findFirst().get());
    }
}
