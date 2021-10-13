package com.java.certification.part2.Q15Estudiar;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private LocalDate birthDay;
    // The constructors, getters, and setters methods go here


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        List<Employee> roster = new ArrayList<>();
//...
        Predicate<Employee> y = (Employee e) -> e.getBirthDay()
                .isBefore(IsoChronology.INSTANCE.date(1989, 1, 1));
        Set<String> s1 = roster.stream().collect(Collectors.partitioningBy(y)).get(true).stream().
                map(Employee::getName).collect(Collectors.toCollection(TreeSet::new));
// line 1
    }
}
