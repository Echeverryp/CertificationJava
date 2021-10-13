package com.java.certification.lambdaExpresions;

public class Q1 {

    interface Changeable {
        void change(String s);
    }

    public static void main(String[] args) {

        String prueba="Jello";
        prueba=prueba+ "Moto";
        Q1 t = new Q1();
        Changeable c = (s) -> s = s + " World"; // Line 1

        String str = "Hello";

        t.changeIt(str, c);  // Line 2
        t.changeIt(str, (s) -> s = s + " Hello");  // Line 3
        System.out.println(str);
    }

    public void changeIt(String s, Changeable c) {
        c.change(s);
    }

}
