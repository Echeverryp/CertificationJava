package com.java.certification.questions.Serializable;

import java.io.*;

public class Serializacion {

    public static void main(String[] args) {
        Empleado empleado=new Empleado("Pablo","Echeverry");

        Empleado[] personal=new Empleado[3];
        personal[0]=empleado;
        personal[1]=new Empleado("Pablo1","Echeverry1");

        personal[2]=new Empleado("Pablo2","Echeverry2");

        try {
            ObjectOutputStream escribiendo_fichero=
                    new ObjectOutputStream(new FileOutputStream("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Serializable/empleado.dat"));
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();

            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Serializable/empleado.dat"));
            Empleado[] personalRecuperado= (Empleado[])recuperando_fichero.readObject();
            System.out.println(personalRecuperado);
            recuperando_fichero.close();

        }catch (Exception e){

        }
    }


    static class Empleado implements Serializable {

        //esta variable se usa para que java reconozca la marca de la clase en caso de que el receptor no tenga ajustes
        //especificos del modelo, ejemplo : que a la clase empleado lo mandamos con String nombres y el receptor lo reciba con
        //String nombre.. en este caso fallaria pero con el serial se le establece un ID para que el receptor lo reconozca sin problema
        private static final long serialVersionUID=1L;

        String nombre;
        String apellido;

        @Override
        public String toString() {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    '}';
        }

        public Empleado(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    }

    static class Administrador extends Empleado{

        private static final long serialVersionUID=1L;

        public Administrador(String nombre, String apellido) {
            super(nombre, apellido);
        }
    }
}
