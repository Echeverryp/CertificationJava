package com.java.certification.genericos;

public class ClaseGenerica <T>{

    private T objeto;

    public ClaseGenerica(T generico)
    {
        this.objeto=generico;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo(){
        System.out.println("El tipo T es = " + objeto.getClass().getSimpleName());
    }
}
