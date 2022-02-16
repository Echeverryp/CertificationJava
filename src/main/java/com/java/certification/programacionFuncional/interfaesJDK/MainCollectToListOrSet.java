package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainCollectToListOrSet {
    public static List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
            , new Pet("Bruno" , 8), new Pet("Bucky",4));

    public static void main(String[] args) {

        Collector<String,?,List<String>> collector=Collectors.toList();
        Collector<String,?,List<String>> collector2=Collectors.toCollection(LinkedList::new);
        Collector<String,?,List<String>> collector3=Collectors.toUnmodifiableList();
        Collector<String,?, Set<String>> collector4=Collectors.toSet();
        Collector<String,?,Set<String>> collector5=Collectors.toCollection(TreeSet::new);
        Collector<String,?,Set<String>> collector6=Collectors.toUnmodifiableSet();


        printTypeOfCollections(collector);
        printTypeOfCollections(collector2);
        printTypeOfCollections(collector3);
        printTypeOfCollections(collector4);
        printTypeOfCollections(collector5);
        printTypeOfCollections(collector6).forEach(System.out::println);
    }

    private static <T> T printTypeOfCollections(Collector<String,? , T> collector){

        var collections= lst.stream().filter(p->p.getAge()>0)
                .map(Pet::getName).
                distinct().collect(collector);
        System.out.println("TypeResult: <<" + collections.getClass().getSimpleName() + " >>" );
        return collections;
    }
}
