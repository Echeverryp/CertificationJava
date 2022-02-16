package com.java.certification.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Ejemplo_File {

    public static void main(String[] args) {
        //Cuando se pone "/" en el pathname se deben poner "//" por que son caracteres de escape
        //Si se deja una sola "/" lo toma como un /f
        File fichero= new File("prueba.txt");
        File fichero2= new File("nuevoarchivo.txt");
        File ficheroNoExiste= new File("pruebaNoExiste.txt");

        File directorio= new File("\\DirectoroNuevo");

        try {
            //En caso de que no exista , crea el archivo, sino , no lo crea
            fichero.createNewFile();
            ficheroNoExiste.createNewFile();

            //En caso de que no exista el directorio , lo crea, de lo contrario , no lo crea
            directorio.mkdir();

            //Dice si el archivo existe
            System.out.println("Existe el archivo?");
            System.out.println("Con file : "+fichero.exists());
            System.out.println("Con Directorio : "+directorio.exists());
            System.out.println("");

            System.out.println("Es directorio?");
            System.out.println("File : "+fichero.isDirectory());
            System.out.println("Directorio :"+directorio.isDirectory());
            System.out.println("");

            System.out.println("Es Archivo?");
            System.out.println("File : "+fichero.isFile());
            System.out.println("Directorio :"+directorio.isFile());
            System.out.println("");

            //Ruta absoluta: La que empieza desde la Raiz hasta el fichero
            System.out.println("Ruta Absoluta");
            System.out.println("File : "+fichero.getAbsolutePath());
            System.out.println("Directorio :"+directorio.getAbsolutePath());
            System.out.println("");

            //***SE USA MAS QUE TODO PARA SABER TEMAS DE PERMISOS****////
            System.out.println("Se puede leer?");
            System.out.println("File : "+fichero.canRead());
            System.out.println("Directorio :"+directorio.canRead());
            System.out.println("");

            System.out.println("Se puede escribir?");
            System.out.println("File : "+fichero.canWrite());
            System.out.println("Directorio :"+directorio.canWrite());
            System.out.println("");

            System.out.println("Se puede ejecutar?");
            System.out.println("File : "+fichero.canExecute());
            System.out.println("Directorio :"+directorio.canExecute());
            System.out.println("");
            //***SE USA MAS QUE TODO PARA SABER TEMAS DE PERMISOS****////


            System.out.println("Nombre Sin Rutas: ");
            System.out.println("File : "+fichero.getName());
            System.out.println("Directorio :"+directorio.getName());
            System.out.println("");

            System.out.println("Nombre del Directorio Padre?");
            System.out.println("File : "+fichero.getParent());
            System.out.println("Directorio :"+directorio.getParent());
            System.out.println("");


            ///////////Guarda en un Array los directorios Hijos , solo con directorios
            //Coge todos los directorios y ficheros de un directorio

            File lista[]=directorio.listFiles();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }

            System.out.println("");

            ///////////Guarda en un array de String los directorios Hijos, solo con directorios
            String listaString[]=directorio.list();
            for (int i = 0; i < listaString.length; i++) {
                System.out.println(listaString[i]);
            }

            FileOutputStream fileOutputStream=new FileOutputStream("prueba.txt");
            fileOutputStream.write(2);
            PrintWriter printWriter=new PrintWriter(fileOutputStream);
            printWriter.println("PROBANDO");
            printWriter.close();
            System.out.println("oli*¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            //////////////////////////////
            Path path= Paths.get("C:\\Users\\pablo\\Desktop\\Repositoris\\JavaCertification");
            //BasicFileAttributes attr=Files.readAttributes(path,BasicFileAttributes.class);
            System.out.println(path.normalize());

            //Files.lines(path).forEach(System.out::println);
            //BasicFileAttributes basicFileAttributes= Files.readAttributes(path,BasicFileAttributes.class);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
