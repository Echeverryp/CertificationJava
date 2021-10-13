package com.java.certification.Clases;

class Thing {

    // Constructor
    Thing() {
        secondString = "b" + secondString;
    }

    // Initializer
    {
        firstString = "a" + this.secondString;
    }

    // Static Initializer
    static {

        thirdString = "c";
       // System.out.printf(thirdString);
    }

    // Two instance variables
    String firstString;
    String secondString;

    // static variable
    static String thirdString;

    public String toString() {
        return firstString + secondString + thirdString;
    }
}

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }
}