package com.java.certification.StringTests;

import java.util.Arrays;

public class PruebaConStringBuilder {

    public static void main(String... args) {  //  Line 1

        String hello = "hello";
        String helloMay = "Hello";
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");

        System.out.println(sb.equals(hello));
        System.out.println(sb.toString().equals(helloMay));

        System.out.println("Lenght "+sb.length());
        System.out.println("Capacity "+sb.capacity());

        StringBuilder sb1=new StringBuilder("Hello");

        System.out.println("sb1 Lenght "+sb1.length());
        System.out.println("sb1 Capacity "+sb1.capacity());


        StringBuilder sb3=new StringBuilder();
        sb3.append("abcdefhijklmnopqrstuvwxyz");

        System.out.println("sb3 Lenght "+sb3.length());
        System.out.println("sb3 Capacity "+sb3.capacity());

        //STRIN BUILDER ==
        StringBuilder stringBuilderIgual=new StringBuilder("Hello");
        StringBuilder stringBuilderIgual1=new StringBuilder("abc");

        System.out.println("== s1  y s2 "+ (stringBuilderIgual==stringBuilderIgual1));

        System.out.println("Equals s1  y s2 "+ stringBuilderIgual.equals(stringBuilderIgual1));

        System.out.println("CompareTo s1  y s2 "+ stringBuilderIgual.compareTo(stringBuilderIgual1));

        System.out.println("== s1  y s2 "+ stringBuilderIgual.toString().equals(stringBuilderIgual1.toString()));

        System.out.println("== s1  y s2 "+ stringBuilderIgual.toString()==stringBuilderIgual1.toString());



        //APPEND

        System.out.println("Append");
        StringBuilder stringBuilderAppend=new StringBuilder();
        stringBuilderAppend.append("Hello").append(new char[]{'W','O','R','L','D'}).append(',').append((Object) " MY ")
        .append("New Number",3,9).append(" is ").appendCodePoint(97).append(" float value is " ).append(205.5f);
        System.out.println(stringBuilderAppend.toString());


        StringBuilder sbDelete=new StringBuilder("World Hello, How are you?");
        System.out.println("DELETE VALUE "+ sbDelete);
        //BORRA LA COMA DEL STRING
        //EL INDEX ES PARA ENCONTRAR LA POSICION DE LA COMA
        //BORRA SOLO LA PRIMERA QUE ENCUENTRA
        System.out.println("DELETE VALUE "+ sbDelete.deleteCharAt(sbDelete.indexOf("o")));

        //BORRA DESDE 11 HASTA EL TAMAÑO FINAL DEL STRING
        System.out.println("DELETE VALUE "+ sbDelete.delete(11,sbDelete.length()));
        sbDelete.reverse();
        //PONE EL TEXTO AL REVES
        System.out.println("DELETE VALUE "+ sbDelete.toString());

        //COGE DESDE LA POSICION 0 HASTA EL 5 Y DEVUELVE UN STRING
        String subStringExample=sbDelete.substring(0,5);

        StringBuilder stringBuilderSpace=new StringBuilder();
        stringBuilderSpace.append("*              ABC          *");
        System.out.println("CAPACITY " +   stringBuilderSpace.capacity());
        System.out.println("LENGHT " +   stringBuilderSpace.length());
        System.out.println("VALUE " +   stringBuilderSpace.toString());

        //el string obtiene el tamaño real del string y no aumenta la capacidad segun lo establecido
        stringBuilderSpace.trimToSize();

        System.out.println("CAPACITY " +   stringBuilderSpace.capacity());
        System.out.println("LENGHT " +   stringBuilderSpace.length());
        System.out.println("VALUE " +   stringBuilderSpace.toString());
        System.out.println("TRIP "+stringBuilderSpace.toString().strip());

        stringBuilderSpace.replace(0,stringBuilderSpace.length(),stringBuilderSpace.toString().strip());
        System.out.println("VALUE " +   stringBuilderSpace);

        char[] arregloChars=new char[10];
        stringBuilderSpace.toString().getChars(20,27,arregloChars,3);

        System.out.println(Arrays.toString(arregloChars));

        if(""==""){}
    }
}
