package com.java.certification.part2.Q12Estudiar;

public class Q12 {

    public static void main(String[] args) {
        char[][] arrays = {{'g', 'j'}, {'h', 'k'}, {'i', 'l'}};
        for (char[] xx : arrays) {
            for (char yy : xx) {
                System.out.print(yy);
            }
            System.out.print(" ");
        }
    }

}
