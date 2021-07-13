package com.java.certification.questions.Q0;

public class VariableAguments {

    public static void suma(String nombre,int ...numero){
        System.out.println("Hola "+nombre);
        for (Integer num: numero) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        suma("Pablo",1,2,3,4,5);
    }
}
