package com.java.certification.questions.Q1;

import java.util.List;

public class MainEnum {

    public static void main(String[] args) {
        var list= List.of("","","");
        char[][] arrays = {{'g', 'j'}, {'h', 'k'}, {'i', 'l'}};
        for (char[] xx : arrays) {
            for (char yy : xx) {
                System.out.print(yy);
            }
            System.out.print(" ");
        }
        //Enum e=Enum.valueOf(Enum.class,"A");
       // System.out.println(e);
        System.out.println(Enum.MINI.getS());
        System.out.println(Enum.MINI.toString());
        System.out.println(Enum.values()[1].toString());
    }
}
