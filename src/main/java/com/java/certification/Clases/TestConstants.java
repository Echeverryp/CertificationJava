package com.java.certification.Clases;

public class TestConstants {

    public static boolean debugFlag ;
    public static final String APP_NAME ;  // Line 1
    static {
        if (debugFlag) APP_NAME="FooBarApp";  // Line 2
        else  APP_NAME="GreatApp";
    }


}

 class Test {
    public static void main(String[] args) {
        //APESAR DE SETEAR LA INFO, PRIMERO EJECUTA TODO LO Q ESTA ARRIBA
        TestConstants.debugFlag=true;  // Line 3
        System.out.println(TestConstants.APP_NAME);   // Line 4
        System.out.println(TestConstants.APP_NAME);
    }
}
