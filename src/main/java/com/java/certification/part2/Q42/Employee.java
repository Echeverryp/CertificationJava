package com.java.certification.part2.Q42;

import java.util.*;
import java.util.stream.Collectors;

public class Employee{

    private String name;
    private String neighborhood;

    public Employee(String name, String neighborhood) {
        this.name = name;
        this.neighborhood = neighborhood;
    }


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public static void main(String[] args) {
        List<Employee> roster = List.of(new Employee("John", "West town"),
                new Employee("Ray", "South town"),
                new Employee("Tom"),
                new Employee("Renny", "West town"));

        //Es object en el map , por el optional en elempleado que no tiene neighborhood
        Map<Object,List<Employee>> listaMap=roster.stream().collect(Collectors.groupingBy(p->Optional.ofNullable(p.getNeighborhood())));

    }


}
