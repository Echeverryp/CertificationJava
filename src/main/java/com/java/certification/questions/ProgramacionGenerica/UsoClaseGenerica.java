package com.java.certification.questions.ProgramacionGenerica;

public class UsoClaseGenerica {

    public static void main(String[] args) {
        ClaseGenerica<String> claseGenerica=new ClaseGenerica<>();
        claseGenerica.setPrimero("Testo Primero");
        String primero=claseGenerica.getPrimero();

        ClaseGenerica<Persona> personaClaseGenerica=new ClaseGenerica<>();
        Persona persona=new Persona("Pablo");

        personaClaseGenerica.setPrimero(persona);
    }


    static class Persona{
        private String nombre;

        public Persona(String nombre){
            this.nombre=nombre;
        }
    }
}
