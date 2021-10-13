package com.java.certification.part2.Q32;

public class Q32 {

    public static void main(String[] args) {
        String s = "hat at store";
        int x = s.indexOf("at");
        //devuelve el string desde la posiion que uno ingrese .. en este caso seria desde la posicion 5
        //osea que devolveria "t store"
        String probandosub= s.substring(5);
        s.substring(x+3);
        x = s.indexOf("at");
        System.out.println(s + " " + x);
    }
}
