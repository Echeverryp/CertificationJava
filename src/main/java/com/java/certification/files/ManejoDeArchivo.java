package com.java.certification.files;

import java.io.*;

public class ManejoDeArchivo {

    public static void crearArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida=new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void escribirArchivo(String nombreArchivo,String contenido){
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida=new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    public static void anexarArchivo(String nombreArchivo,String contenido){
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida=new PrintWriter(new FileWriter(nombreArchivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado informacion en el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void leerArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String lectura= entrada.readLine();

            while (lectura!=null){
                System.out.println(lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
