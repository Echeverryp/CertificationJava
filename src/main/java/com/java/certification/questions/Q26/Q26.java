package com.java.certification.questions.Q26;

import java.util.List;
import java.util.function.Function;

public class Q26 {

    public static void main(String[] args) {

        Function<Integer,Integer> f =n->n*2;
        var numbers= List.of(1,2,3,4,5,6,7,8,9,10);

        StringBuilder stringBuilder=new StringBuilder();
        for(int a : numbers){
            stringBuilder.append(f.apply(a));
            stringBuilder.append("");

        }
        System.out.println(stringBuilder.toString());
    }
}
