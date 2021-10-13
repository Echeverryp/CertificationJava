package com.java.certification.part2.Q33Estudiar;

import java.util.List;
import java.util.stream.IntStream;

public class Q33 {

    public static void main(String[] args) {
        final List<String> fruits =
                List.of("Orange", "Apple", "Lemon", "Raspberry");
        final List<String> types =
                List.of("Juice", "Pie", "Ice", "Tart");
        int sizeFruit=fruits.size();

        //EL TAMAÑO DE UN ARREGLO ES IGUAL A 4 , OSEA AL NUMERO REAL
        Math.min(fruits.size(),types.size());
        final var stream =
                IntStream.range(0, Math.min(fruits.size(), types.size()))
                        .mapToObj((i -> fruits.get(i) + " " + types.get(i)));
        stream.forEach(System.out::println);
    }
}
