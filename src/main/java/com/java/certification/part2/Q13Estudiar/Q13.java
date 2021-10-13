package com.java.certification.part2.Q13Estudiar;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Q13 {
    public static void main(String[] args) {
        //DoubleStream.generate(Random::nextDouble).limit().forEach(System.out::println);

       // DoubleStream.generate(Random.nextDouble)
        var r=new Random();
        //new DoubleStream.generate(r::nextDouble).limit(100).forEach(System.out::println);

        DoubleStream.generate(r::nextDouble).limit(100).forEach(System.out::println);

        IntStream intsTREM= IntStream.generate(r::nextInt);

        System.out.println(intsTREM);


    }
}
