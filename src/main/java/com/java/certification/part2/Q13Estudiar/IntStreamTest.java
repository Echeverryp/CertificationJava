package com.java.certification.part2.Q13Estudiar;

import java.util.stream.IntStream;

public class IntStreamTest {

    public static void main(String[] args) {
        System.out.println("--Using IntStream.rangeClosed--");
        //El range clased permite que vaya desde el 13 al 15 -- cuando es range solo va del 13 al 14 (no toma el ultimo numero
        //que en este caso seria 15
        //En este caso al hacer el map espera devolver un numero y hace n*n osea 13*13,14*14,15*15
        IntStream.rangeClosed(13, 15).map(n->n*n).forEach(s->System.out.print(s +" "));
        System.out.println("\n--Using IntStream.range--");
        IntStream.range(13,15).map(n->n*n).forEach(s->System.out.print(s +" "));
        System.out.println("\n--Sum of range 1 to 10--");
        System.out.print(IntStream.rangeClosed(1,10).sum());
        System.out.println("\n--Sorted number--");
        IntStream.of(13,4,15,2,8).sorted().forEach(s->System.out.print(s +" "));
    }
}
