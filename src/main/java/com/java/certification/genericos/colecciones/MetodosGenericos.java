package com.java.certification.genericos.colecciones;

public class MetodosGenericos {

    public static void main(String[] args) {

        String[] nombres={"P","A","B"};

        System.out.println(MisMatrices.<String>getElementos(nombres));
    }
}

class MisMatrices{

    public static <T> String getElementos(T[] a){
        return "El array tiene " + a.length + " Elemenos";
    }

    public static <T extends Comparable> T getMenor(T[] arreglo){

        if(arreglo==null || arreglo.length==0){
            return null;
        }
        T elementoMenor=arreglo[0];

        for (int i = 0; i < arreglo.length ; i++) {
            if(elementoMenor.compareTo(arreglo[i])>0){
                elementoMenor=arreglo[i];

            }

        }
        return elementoMenor;
    }
}
