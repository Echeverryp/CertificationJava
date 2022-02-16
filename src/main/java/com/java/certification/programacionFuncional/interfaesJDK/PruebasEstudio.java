package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PruebasEstudio {

    public static void main(String[] args) {
        List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 4), new Pet("Bucky",4));

        /*System.out.println(lst.stream().mapToDouble(Pet::getAge).average().getAsDouble());
        System.out.println(lst.stream().mapToDouble(Pet::getAge).sum());
        System.out.println(lst.stream().mapToInt(Pet::getAge).average().getAsDouble());
        System.out.println(lst.stream().mapToInt(Pet::getAge).sum());

        System.out.println(lst.stream().filter(pet->pet.getAge()>10).findFirst().get().getName());
*/

        Function<Pet,List<Pet>> valueMap=pet -> {
            var ls=new ArrayList<Pet>();
            ls.add(pet);
            return ls;
        };

        BinaryOperator<List<Pet>> merge= (lst1,lst2)->{
          lst1.addAll(lst2);
          return lst1;
        };


        //lst.stream().map(pet->pet.getName()).toArray();
        //lst.stream().collect(Collectors.toMap(Pet::getName,valueMap)).entrySet().stream().forEach(System.out::println);

        lst.stream().collect(Collectors.partitioningBy(p->p.getAge()>4)).entrySet().forEach(System.out::println);
        //lst.stream().collect(Collectors.groupingBy(Pet::getAge, LinkedHashMap::new,Collectors.toSet())).entrySet().stream().forEach(System.out::println);
       // prueba.forEach(System.out::println);

    }
}
