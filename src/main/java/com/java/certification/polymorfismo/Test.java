package com.java.certification.polymorfismo;

import com.java.certification.part2.Q3.T;

class SubClass {
    public static String classyName = "abc";
    public static String getClassyName() { return classyName; }
}

public class Test extends SubClass {
    public static String classyName = "def";
    public static String getClassyName() { return classyName; }

    public static void main(String[] args) {

        SubClass pruebita=new SubClass();

       // Test pruebitaTest= (Test) pruebita;

        Test pruebitaAlrevez=new Test();

        SubClass pruebitaAL=pruebitaAlrevez;

        Test tt = new Test();
        Object t = tt;
        Object s = new SubClass();
        int abcCount = 0;
        int defCount = 0;

        int tempcount = ((Test) t).classyName == "abc" ? abcCount++ : defCount++;
        tempcount = ((SubClass) s).classyName == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName(t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName(s) == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName((Test) t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName((SubClass) s) == "abc" ? abcCount++ : defCount++;

        System.out.println("abcCount = " + abcCount);
    }

    public String getClassyName(Object t) {
        Test tt = (Test) t;
        return tt.getClassyName();
    }

    public String getClassyName(SubClass sc) {
        return sc.getClassyName();
    }
}