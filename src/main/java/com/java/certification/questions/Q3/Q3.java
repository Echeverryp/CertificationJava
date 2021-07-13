package com.java.certification.questions.Q3;

import java.util.function.Consumer;

public class Q3 {

    public static void main(String[] args) {

        Consumer<String> c1 =arg->  System.out.println(arg);
        c1.accept("c1 accepted");

        Consumer<String> c2 =arg->  System.out.println(arg);
        c2.accept("c2 accepted");

        Consumer<String> c3 =arg->  System.out.println(arg);
        c2.accept("c3 accepted");

        c2.andThen(c1).accept("after then");

        c2.andThen(c1).andThen(c3).accept("after then again");

        c2.accept("c2 accepted again");
    }
}
