package com.java.certification.questions.Q0;

public abstract class AbstractClass {
    public static String hola="ABC";
    
    public String getHola(){
        hola="ABCD";
        return hola;
    }

    public abstract void holaAbstractPublic();

    protected abstract void holaAbstractProtected();

    //NO SE PUEDE UN ABSTRACT PRIVADO
    //private abstract void holaAbstractPrivate();

    protected void holaProtected(){
        System.out.println("Hello from my father Class");
    }
    private void holaPrivate(){

    }
    public void holaPublic(){
        System.out.println("Hello from my father Class");
    }
}
