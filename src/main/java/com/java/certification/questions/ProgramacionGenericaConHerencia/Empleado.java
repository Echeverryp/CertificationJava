package com.java.certification.questions.ProgramacionGenericaConHerencia;

public class Empleado {

    private String nombre;

    private int edad;

    private double salario;


    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    private String dameDatos(){
        return "Nombre : " + this.nombre + " Edad : " + this.edad + " Salario: " + this.salario;
    }
}
