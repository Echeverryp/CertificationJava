package com.java.certification.questions.Collecciones;

import java.util.HashMap;
import java.util.Map;

public class PruebaMaps {

    public static void main(String[] args) {



        HashMap<String , Empleado> personal=new HashMap<>();
        personal.put("1",new Empleado("Pepe"));
        personal.put("2",new Empleado("Pepe1"));
        personal.put("3",new Empleado("Pepe2"));
        personal.put("4",new Empleado("Pepe3"));
        personal.put("5",new Empleado("Pepe4"));

        System.out.println(personal);
        personal.remove("1");
        System.out.println(personal);
        personal.put("5",new Empleado("Remplazo"));
        //NOS LO DEVUELVE EN FORMA DE SET 
        System.out.println(personal.entrySet());

        for (Map.Entry<String,Empleado> entrada:personal.entrySet()) {
            String clave= entrada.getKey();
            Empleado valor=entrada.getValue();

            System.out.println("Clave " + clave + " VALOR " + valor);

            
        }

    }
    
    
    static class Empleado{

        private String nombre;
        private double sueldo;
        public Empleado (String n){
            this.nombre=n;
            this.sueldo=2000;

        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", sueldo=" + sueldo +
                    '}';
        }
    }
}
