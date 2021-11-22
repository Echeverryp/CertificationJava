package com.java.certification.Optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonaOptionals {

    static List<Persona> personas;

    public static void initData(){
        personas= Arrays.asList(new Persona("Pablo"),
                new Persona("Andres"),
                new Persona("Echeverry"));
    }

    public static Optional<Persona> findFirst(String nombre){
        return personas.stream().filter(p->p.getNombre().equalsIgnoreCase(nombre)).findFirst();
    }

    public static void main(String[] args) {

        initData();
        Persona p1 = findFirst("Pablo").get();

        System.out.println(p1.getNombre());

        Persona p2= findFirst("Pepe").orElse(new Persona("Otro"));

        System.out.println(p2.getNombre());

        Persona p3= findFirst("Pepe").orElseGet(Persona::new);

        System.out.println(p3.getNombre());

        String nombre= findFirst("Andres").map(Persona::getNombre).orElse("Desconocido");

        System.out.println(nombre);

    }
}
