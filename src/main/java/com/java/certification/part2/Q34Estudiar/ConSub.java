package com.java.certification.part2.Q34Estudiar;

public class ConSub extends ConSuper{

    ConSub() {
        this(4);
        System.out.print("1");
    }
    ConSub(int a) {
        System.out.print(a);
    }

    public static void main(String[] args) {
        new ConSub(4);
    }
}
