package com.java.certification.questions.Herencia;

public class Persona {


    private String nombre;
    private String apellido;
    private String genero;
    private Integer edada;
    protected String protegido;

    public Persona(String nombre, String apellido, String genero, Integer edada, String protegido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edada = edada;
        this.protegido = protegido;
    }

    public String getProtegido() {
        return protegido;
    }

    public void setProtegido(String protegido) {
        this.protegido = protegido;
    }

    public Persona(String nombre, String apellido, String genero, Integer edada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edada = edada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEdada() {
        return edada;
    }

    public void setEdada(Integer edada) {
        this.edada = edada;
    }

    public String HolaMundoDesdePersonaFather(){
        return "HolaMundoDesdePersonaFather";
    }

}
