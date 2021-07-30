package com.java.certification.questions.Collecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

    public static void main(String[] args) {
        LinkedList<String> paises=new LinkedList<>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Pero");

        LinkedList<String> capitales=new LinkedList<>();
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");

        System.out.println(paises);
        System.out.println(capitales);

        ListIterator<String> iterA=paises.listIterator();
        ListIterator<String> iterB=capitales.listIterator();

        while(iterB.hasNext()){

            if(iterA.hasNext()){
                    iterA.next();

            }
            iterA.add(iterB.next());
        }

        System.out.println(paises);

        //REINICIA EL ITERADOR
        iterB=capitales.listIterator();

        //ELIMINA LOS PARES
        while(iterB.hasNext()){
            iterB.next();
            if(iterB.hasNext()){
                iterB.next();
                iterB.remove();
            }
        }

        System.out.println(capitales);

        paises.removeAll(capitales);
        //ELIMINA CON UNA COLECCION 
        System.out.println(paises);
    }
}
