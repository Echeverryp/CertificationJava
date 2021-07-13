package com.java.certification.questions.Q5;

public class Q5 {

    public static int reduce(int x){
        int y =4;

        class Computer{
            int reduce(int x){
                //return x-y--;
                return x;
            }

        }

        Computer a =new Computer();
        return a.reduce(x);
    }

    public static void main(String[] args) {
        System.out.println(reduce(1));
    }
}
