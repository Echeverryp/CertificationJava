package com.java.certification.questions.Q0;

public class BloqIniciali {

    int numero=1;
    static int numeroStatic=1;
    //AL SER ESTATICO, ESTE BLOQUE SOLO SE EJECUTA LA PRIMERA VEZ QUE INICIALIZAMOS LA VARIABLE
    static {
        //NO SE PUEDE, SOLO SE PUEDEN VARIABLES STATICAS
        //System.out.println(this.numero);
        System.out.println(numeroStatic);
        numeroStatic++;
        System.out.println("Soy un bloque de incializacion estático");
    }

    public static void main(String[] args) {
        BloqIniciali bloqIniciali=new BloqIniciali();
        BloqIniciali bloqIniciali1=new BloqIniciali();
    }
}
