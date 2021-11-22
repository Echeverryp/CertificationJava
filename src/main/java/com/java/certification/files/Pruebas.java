package com.java.certification.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Pruebas {

    public static void main(String[] args) {


        String pathPrueba= "C://Prueba//..//..//Pablo//prueba.txt";
        Path path= Paths.get(pathPrueba);
        System.out.println(path.normalize());

        String archivo="prueba.txt";
        File archivoFile=new File(archivo);

        Path filePath = Paths.get("prueba.txt");
        try {
            Files.lines(filePath).forEach(System.out::println);

            BasicFileAttributes attributes= Files.readAttributes(path,BasicFileAttributes.class);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
