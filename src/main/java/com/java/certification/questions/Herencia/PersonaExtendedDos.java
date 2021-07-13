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
        PersonaExtendedDos personaExtendedDos=new PersonaExtendedDos("Nombre","Apellido","M",21,"Protegido");
        String hola=personaExtendedDos.hola();
        System.out.println(hola);


    }
}
