package com.java.certification.StringTests;

public class TestDos {

    public static void main(String[] args) {

        int i = 0;
        int j = 5;
        int k = 10;

        int loopIterations = 0;

        //PRMERO VALIDA LA PRIMERA Y VA SUMANDO EL I++ .. NO TIENE NECESIDAD DE IR HASTA LA SEGUNDA POR QUE YA ENCONTRO UNA RAZON PARA
        //ENTRAR AL WHILE , CUANDO LA PRIMERA CONDICIÓNAL EMPIEZA A FALLAR , ENTRA A LA SEGUNDA PERO DE IGUAL FORMA PREGUNTA POR LA PRIMERA
        //Y SIGUE HACIENDO LA SUMA DEL I++
        while ((i++ < j) || (j < --k)) {

            loopIterations++;
        }
        System.out.println(loopIterations);

    }

}
