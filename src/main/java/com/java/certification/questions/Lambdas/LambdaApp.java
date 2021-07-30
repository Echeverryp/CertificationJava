package com.java.certification.questions.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
    public static void ordenar(){
        List<String> lista=new ArrayList<>();
        lista.add("Mitocode");
        lista.add("Code");
        lista.add("Mito");

        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String nombres:lista
             ) {
                System.out.println(nombres);
        }
    }

    public static void ordenarLambda(){
        List<String> lista=new ArrayList<>();
        lista.add("Mitocode");
        lista.add("Code");
        lista.add("Mito");

        Collections.sort(lista, (String a1, String a2)->a1.compareTo(a2));

        for (String nombres:lista
        ) {
            System.out.println(nombres);
        }
    }

    public static void calcular(){
        calcularPromedio calcularPromedio=new calcularPromedio() {
            @Override
            public double comparar(int a1, int a2) {
                return a1/a2;
            }
        };

        calcularPromedio calcularPromedio1=(int a1 , int a2)->a1/a2;
        System.out.println(calcularPromedio1.comparar(10,2));
    }

    public static void main(String[] args) {
        calcular();
    }
}
