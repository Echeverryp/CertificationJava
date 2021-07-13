package com.java.certification.questions.Q0;

public class AbstractExtends extends AbstractClass{

    @Override
    public void holaAbstractPublic() {
        System.out.println("Hello from my class");
    }
    public void holaProtected(){
        System.out.println("Hola protected from my class");
    }

    public void holaPublic(){
        System.out.println("Hola public from my class");
    }
    @Override
    protected void holaAbstractProtected() {

        System.out.println("Hello from my class");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass=new AbstractExtends();

        abstractClass.holaProtected();
        abstractClass.holaPublic();
        abstractClass.holaAbstractProtected();
        abstractClass.holaAbstractPublic();
        System.out.println("*******************************");

        AbstractExtends abstractExtends=new AbstractExtends();

        abstractExtends.holaProtected();
        abstractExtends.holaPublic();
        abstractExtends.holaAbstractProtected();
        abstractExtends.holaAbstractPublic();
    }


}
