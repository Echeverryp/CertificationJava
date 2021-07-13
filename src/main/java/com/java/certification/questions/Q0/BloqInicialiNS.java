package com.java.certification.questions.Q0;

public class BloqInicialiNS {

    int numero=1;
    static int numeroStatic=1;

    //ESTE BLOQUE SE EJECUTA CADA VEZ QUE CREEMOS UNA NUEVA INSTANCIA DE LA CLASE
     {
        //NO SE PUEDE, SOLO SE PUEDEN VARIABLES STATICAS
        //System.out.println(this.numero);
        System.out.println(numeroStatic);
        numeroStatic++;
        System.out.println("Soy un bloque de incializacion estático");
    }

    public static void main(String[] args) {
        BloqInicialiNS bloqIniciali=new BloqInicialiNS();
        BloqInicialiNS bloqIniciali1=new BloqInicialiNS();

        Integer numer=10;
        int numeroint=numer;

        int numerinttwo=10;
        Integer numerIntTwo=numerinttwo;
    }
}
