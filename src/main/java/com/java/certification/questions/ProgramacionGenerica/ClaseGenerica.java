package com.java.certification.questions.ProgramacionGenerica;
//public class ClaseGenerica <U>
//public class ClaseGenerica <K>
public class ClaseGenerica <T>{

    private T primero;

    public ClaseGenerica(){
        primero=null;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }
}
