package com.java.certification.hilos.video2;

public class ClasePrincipal {


    public static void main(String[] args) {
        Proceso h1=new Proceso("Hila 1");
        Proceso h2=new Proceso("Hilo 2");
        h1.ValorDeLaCondicion(10);

        h1.start();
        h2.start();
    }
}
