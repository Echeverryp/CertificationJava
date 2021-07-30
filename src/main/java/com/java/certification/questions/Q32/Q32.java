package com.java.certification.questions.Q32;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Q32 {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,6,7};
        var list = Arrays.asList(ints);
        UnaryOperator<Integer> uo = x -> x * 3;

        UnaryOperator<Integer> uoa1=(var x)->(x*3);


        //PERMITIDO//UnaryOperator<Integer> uoa2=x->{return x*3;};
        //NO PERMITIDO//UnaryOperator<Integer> uoa2=x->{return x*3};
        //PERMITIDO//UnaryOperator<Integer> uoa2=(var x)->x*3;
        //NO PERMITIDO//UnaryOperator<Integer> uoa2=(int x)->x*3;
        //PERMITIDO//UnaryOperator<Integer> uoa2=(Integer x)->x*3;
        list.replaceAll(uo);
        System.out.println(list);
    }
}
