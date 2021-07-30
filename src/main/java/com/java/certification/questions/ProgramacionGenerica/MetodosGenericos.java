package com.java.certification.questions.ProgramacionGenerica;

import com.java.certification.questions.ArrayList.Empleado;

import java.util.GregorianCalendar;

public class MetodosGenericos {

    public static void main(String[] args) {

        //EJEMPLO CON GET ELEMENTOS

        String[] nombres= {"Pablo","Andres","Echeverry"};
        //String elementos=MisMatrices.<String>getElementos(nombres);
        String elementos=MisMatrices.getElementos(nombres);
        System.out.println(elementos);

        Empleado[] empleados= {new Empleado("","",15),new Empleado("","",15),
                new Empleado("","",15),new Empleado("","",15)};

        String elementosEmpleado = MisMatrices.getElementos(empleados);
        System.out.println(elementosEmpleado);


        //EJEMPLO CON ELEMENTO MENOR

        String[] nombresMenor= {"Pablo","Andres","Echeverry"};
        System.out.println(MisMatrices.getElementoMenor(nombresMenor));



        //ESTE CASO NO FUNCIONA, POR QUE LA CLASE EMPLEADO NO EXTIENDE DE LA INTERFAZ COMPARABLE
        /*Empleado[] empleadosMenor= {new Empleado("Pablo","",15),new Empleado("Jose","",15),
                new Empleado("Lilian","",15),new Empleado("","",15)};

        System.out.println(MisMatrices.getElementoMenor(empleadosMenor));*/

        GregorianCalendar fechas[]={new GregorianCalendar(2015,07,12),new GregorianCalendar(2020,01,12),
                new GregorianCalendar(2015,07,11)};
        System.out.println(MisMatrices.getElementoMenor(fechas));


    }


    static class MisMatrices{

        public static <T> String getElementos(T[] array){

            return "El array tiene " + array.length + " Elementos";
        }

        //Por que dice extends y no implements?
        //Aparentemente , por que podemos usar cualqueir tipo que implemente la interfa comparable o incluso
        //sus clases, de esa clase que implemente la interfaz comparable , es decir , podemos usar clases que esten en la interfaz
        //y las que hereden la interfaz , pero a su ciencia cierta no se sabe
        public static <T extends Comparable> T getElementoMenor(T[] array){

            if(array==null || array.length==0) return null;

            T elementoMenor=array[0];


            for (int i=1; i<array.length; i++){
                if(elementoMenor.compareTo(array[i])>0){
                    elementoMenor=array[i];
                }
            }

            return elementoMenor;
        }
    }
}
