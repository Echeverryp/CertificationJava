package com.java.certification.part2.Q1;

import java.util.Arrays;
import java.util.Comparator;

public class Q1 {

    //El binary search solo se usa cuando ya se ha realizado un ordenamiento de la matriz (sort)
    public static void main(String[] args) {
        //EL VALOR -5 O -6 O EL NUMERO QUE SALGA CON EL MENOS , SIGNIFICA EL PUNTO DE INSERCION
        // POR EJEMPLO LA W AL NO ESTAR EN EL ARREGLO TESTEANDO ALGO SE AGREGARIA COMO EL ULTIMO VALOR DEL ARREGLO
        String[] testeandoAlgo= {"b","c","a","e","d"};
        Comparator<String> comparator=(a,b)->a.compareTo(b);
        Arrays.sort(testeandoAlgo,comparator);
        //f,e,d,c,b,a

        int valorA =Arrays.binarySearch(testeandoAlgo,"A");
        int valorB =Arrays.binarySearch(testeandoAlgo,"w");
        int valorC =Arrays.binarySearch(testeandoAlgo,"r");
        int valorD =Arrays.binarySearch(testeandoAlgo,"f");
        int valorE =Arrays.binarySearch(testeandoAlgo,"g");


        String[] towns = {"boston", "paris", "bangkok", "oman"};
        Comparator<String> ms = (a, b) -> b.compareTo(a);
        Arrays.sort(towns, ms);
        //PARIS,OMAN,BOSTON,BANGKOK
        //BANGKOK,BOSTON,OMAN,PARIS
        int valor = Arrays.binarySearch(towns,"oman");
        int valor1 = Arrays.binarySearch(towns,"bangkok");
        int valor2 = Arrays.binarySearch(towns,"paris");
        int valor3 = Arrays.binarySearch(towns,"boston");

        Arrays.sort(towns, ms);
        System.out.println(Arrays.binarySearch(towns, "oman", ms));
    }



}
