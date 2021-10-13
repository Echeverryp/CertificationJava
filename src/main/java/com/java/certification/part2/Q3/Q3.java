package com.java.certification.part2.Q3;

public class Q3 {

    public static void main(String[] args) {
        int result = 0;
        //line 1
        Abacus aba= (int a,int b)->(a*b);
        result = aba.calc(10, 20);

        System.out.println(result);
    }
}
