package com.java.certification.questions.Herencia;

import com.java.certification.questions.PersonaInterface;

public class PersonaExtendedDos extends PersonaExtended implements PersonaInterface {

    public PersonaExtendedDos(String nombre, String apellido, String genero, Integer edada, String protegido) {
        super(nombre, apellido, genero, edada, protegido);
    }

    public PersonaExtendedDos(String nombre, String apellido, String genero, Integer edada) {
        super(nombre, apellido, genero, edada);
    }

    public static void main(String[] args) {
        PersonaExtendedDos personaExtendedDos=new PersonaExtendedDos("Nombre1","Apellido","M",21,"Protegido");
        String hola=personaExtendedDos.hola();
        System.out.println(hola + personaExtendedDos.getNombre());
        PersonaExtendedDos personaExtendedDos1=new PersonaExtendedDos("Nombre2","Apellido","M",21,"Protegido");
        String hola2=personaExtendedDos.hola();
        System.out.println(hola2 + personaExtendedDos1.getNombre());
        personaExtendedDos1=personaExtendedDos;
        System.out.println(hola2 + personaExtendedDos1.getNombre());


    }
}
