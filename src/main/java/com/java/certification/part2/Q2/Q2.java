package com.java.certification.part2.Q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of( new Person(44, "Tom"),
                new Person(40, "Aman"),
                new Person(40, "Peter")));
        persons.sort(Comparator.comparing((Person::getAge))
                .thenComparing(Person::getName)
                .reversed());
        persons.forEach(p1 -> System.out.print(" " + p1.getName()));
    }
}
