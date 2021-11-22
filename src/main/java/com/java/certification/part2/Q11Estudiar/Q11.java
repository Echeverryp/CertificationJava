package com.java.certification.part2.Q11Estudiar;

import java.util.List;

public class Q11 {

    public static void main(String[] args) {
        var fruits = List.of("apple", "orange", "banana", "lemon");
        fruits.stream().filter(f->f.contains("n")).findFirst().stream().forEach(System.out::println);

    }
}
