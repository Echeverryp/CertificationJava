package com.java.certification.questions.Q6;

import java.util.Comparator;

public class Q6 {

    public static void main(String[] args) {


        Comparator<Integer> comparatorOK=new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };


        var comparatorOK1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
    }
}
