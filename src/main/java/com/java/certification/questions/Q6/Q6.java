package com.java.certification.questions.Q6;

import java.util.Comparator;
import java.util.List;

public class Q6 {

    public static void main(String[] args) {


        Comparator<Integer> comparatorOK=new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };



        Comparator<String> comparatorString= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        };

        List<String> lista=List.of("A","B","E","D","C");

        lista.stream().sorted( new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        }).forEach(System.out::println);

        var comparatorOK1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
    }
}
