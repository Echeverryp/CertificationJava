package com.java.certification.questions.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainArray {
    public static void main(String[] args) {
        ArrayList<Empleado> empleadoArrayList=new ArrayList<Empleado>();

        //el arraylist pone 10 espacios de memoria , cuando el array sube de mas de 10 elementos el crea otro array mas con otros
        //10 elementos mas y los agrega en el siguiente array, es un proceso que consume bastante memoria porq crea un espacio de
        //memoria donde se almacena la información y destruye el otro

        //se usa para definir una capacidad del array , cuando se conoce el tamaño que vamos a tener en el array
        empleadoArrayList.ensureCapacity(10);
        Empleado empleado=new Empleado("Pablo","Echeverry",26);
        Empleado empleado1=new Empleado("Pablo","Echeverry",27);
        Empleado empleado2=new Empleado("Pablo","Echeverry",28);

        empleadoArrayList.add(empleado);

        empleadoArrayList.add(empleado1);
        empleadoArrayList.add(empleado2);

        //Se usa cuando se esta seguro que no se van a arreglar mas valores al array , para no consumir mas espacio de memoria (esto
        //optimiza recursos
        empleadoArrayList.trimToSize();

        //SET--
        //Ajusta e inserta un valor en la posicion que querramos de un array
        empleadoArrayList.set(0,new Empleado("Pablo1","Echeverry",28));

        //GET--
        //Recupera la información de un empleado , en la posicion que querramos
        empleadoArrayList.get(0);


        Empleado listaEmpleados[]=new Empleado[empleadoArrayList.size()];

        //Copiamos la información del array, al arreglo (pasamos lo que tenia empleadoArraylist a listaEmpleados
        empleadoArrayList.toArray(listaEmpleados);


        for (Empleado empleados:empleadoArrayList
             ) {
            System.out.println(empleados.getApellido());
        }


        //ITERADORES
        //Mecanimos que nos permite acceder secuencialmente a los elementos de la coleccion

        Iterator<Empleado> iteradorEmpleado= Arrays.stream(listaEmpleados).iterator();

       while(iteradorEmpleado.hasNext()){
           Empleado empleadoIterator= iteradorEmpleado.next();
           System.out.println(iteradorEmpleado.next().getEdad());
       }
    }
}
