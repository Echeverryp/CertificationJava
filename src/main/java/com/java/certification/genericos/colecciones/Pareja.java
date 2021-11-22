package com.java.certification.genericos.colecciones;

import com.java.certification.genericos.Persona;
import com.java.certification.questions.Lambdas.Ejercicio.models.Person;

public class Pareja <T>{

    private T primero;


    public Pareja (){
        primero=null;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public static void main(String[] args) {
        Pareja<String> parejaString=new Pareja<>();
        System.out.println(parejaString.primero);
        parejaString.setPrimero("Probandito");
        System.out.println(parejaString.primero);


        Persona persona=new Persona();
        persona.setNombre("Pablo");
        persona.setEdad(27);
        persona.setApellido("Echeverry");

        Pareja<Persona> personaPareja=new Pareja<>();
        personaPareja.setPrimero(persona);
        personaPareja.getPrimero().getApellido();
    }
}
