package com.java.certification.questions.Collecciones;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

    public static void main(String[] args) {

                    LinkedHashSet<String> pruebaHashSet=new LinkedHashSet<>();
        pruebaHashSet.add("Pablo");
        pruebaHashSet.add("Pablo");
        pruebaHashSet.add("Laura");
        pruebaHashSet.add("Ana");
        pruebaHashSet.add("Sandra");

        for (String personasList:pruebaHashSet
        ) {
            System.out.println(personasList);
        }

        LinkedList<String> personas= new LinkedList<>();
        personas.add("Pablo");
        personas.add("Pablo");
        personas.add("Laura");
        personas.add("Ana");
        personas.add("Sandra");

        ListIterator<String> it=personas.listIterator();
        //ESTA EN LA POSICION DOS , OSEA EN EL SEGUNDO PABLO
        it.next();
        //ESTE ADD LO AGREGA A LA LISTA DE PERSONAS
        it.add("Dos");

        for (String personasList:personas
             ) {
            System.out.println(personasList);
        }



    }
}
