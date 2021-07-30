package com.java.certification.questions.UnaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,6,8,10);
        UnaryOperator<Integer> unaryOperator= i -> i*i;

    }
}
