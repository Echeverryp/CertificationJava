package com.java.certification.Clases;

public class Pruebita {

    String getMyName() {
        return myName;   // Line 1
    }

    static String myName = "Test";

    public static void main(String[] args) {

        try {
            Pruebita t1 = new Pruebita();
            Pruebita t2 = null;
            System.out.println(Pruebita.myName);

            System.out.println(t1.myName);  // Line 2
            System.out.println(t1.getMyName());

            System.out.println(t2.myName);  // Line 3
            System.out.println(t2.getMyName());    // Line 4
        } catch (Exception e) {
            System.out.println();
        }
    }
}
