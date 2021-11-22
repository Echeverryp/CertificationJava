package com.java.certification.genericos;


import com.java.certification.questions.Q37.C;

public class TestGenerics {

    public static void main(String[] args) {
        ClaseGenerica<Integer> claseGenerica=new ClaseGenerica(15);
        claseGenerica.obtenerTipo();

        Persona persona=new Persona();
        persona.setApellido("Echeverry");
        persona.setEdad(27);
        persona.setNombre("Pablo");
        ClaseGenerica<Persona> claseGenerica1=new ClaseGenerica(persona);

        claseGenerica1.obtenerTipo();

    }
}
