package com.java.certification.part2.Q20;

import java.util.ArrayList;
import java.util.List;

public class Q20 {

    public static void main(String... args) {
        List<String> list1 = new ArrayList<>(List.of("Plane", "Automobile", "Motorcycle"));
        List<String> list2 = new ArrayList<>(List.copyOf(list1));

        //TIENEN EL MISMO HASHCODE LOS DOS -- SI HAGO UN  ADD HA ALGUNA DE LAS LISTAS , EL HASHCODE CAMBIA
        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        list1.sort((String item1, String item2) -> item1.compareTo(item2));
        list2.sort((String item1, String item2) -> item1.compareTo(item2));
        System.out.println(list1.equals(list2));
    }
}
