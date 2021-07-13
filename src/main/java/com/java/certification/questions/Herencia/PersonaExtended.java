package com.java.certification.questions.Herencia;

import com.java.certification.questions.PersonaInterface;

public class PersonaExtended extends Persona implements PersonaInterface {


    public PersonaExtended(String nombre, String apellido, String genero, Integer edada, String protegido) {
        super(nombre, apellido, genero, edada, protegido);
    }

    public PersonaExtended(String nombre, String apellido, String genero, Integer edada) {
        super(nombre, apellido, genero, edada);
    }


    public static void main(String[] args) {

        PersonaExtended personaExtended=new PersonaExtended("Nombre","Apellido","M",21,"Protegido");

        String holaMundo=personaExtended.HolaMundoDesdePersonaFather();
        Persona persona=new PersonaExtended("Nombre","Apellido","M",21,"Protegido");
        String holaMundop= persona.HolaMundoDesdePersonaFather();
        String protejido= persona.protegido;
        System.out.println(persona.protegido);
    }

    @Override
    public String hola() {
        return "Hola from persona extended";
    }
}
