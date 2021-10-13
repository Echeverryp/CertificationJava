package com.java.certification.Exceptions;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Exceptions, Out of Ordingary
Sub-Topic:  Exceptions in Initializers
*/
class StaticTest {
    public static String currentMessage;

    // Initialized to 0
    public static int currentVal;

    // Static Initializer
    static {
        System.out.println("Initializing class StaticTest");
        try {
            // We force an error for demonstration purposes
            if ((10 / currentVal) > 0) {
                System.out.println("Whoops");
            }
        } catch (Exception e) {
            System.out.println("Caught the error");
        } finally {
            currentVal = 1;
        }
        currentMessage = "Inside Static Initializer";
    }
}

public class InitializerExceptions {
    public static void main(String[] args) {
        System.out.println("Executing main()");
        System.out.println(StaticTest.currentMessage);

    }
}