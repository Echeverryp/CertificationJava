package com.java.certification.part2.Q19Estudiar;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q19 {

    public static void main(String[] args) {
        //6104
        int arr[][]={{5, 10}, {8, 12}, {9, 3}};
        long count= Stream.of(arr)
                .flatMapToInt(IntStream::of)
                .map(n->n + 1)
                .filter(n->(n % 2 == 0))
                .peek(System.out::print)
                .count();
        System.out.print(" " + count);
    }
}
