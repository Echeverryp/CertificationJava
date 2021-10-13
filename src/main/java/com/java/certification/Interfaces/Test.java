package com.java.certification.Interfaces;

public interface Test extends TestDos{
    int valor=1;

    private void doItPrivately() {
        System.out.println("A private method");
    }

    void doThat();

    default String doThat(String s) {
        return s;
    }

    private static void prest(){

    }
}