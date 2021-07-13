package com.java.certification.questions.Q14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q14 {
    public static void main(String[] args) {
        try {


            Path currentFile = Paths.get("C:/Users/pablo/Desktop/Courses/FilesTest/a.txt");
            Path outputFile = Paths.get("C:/Users/pablo/Desktop/Courses/FilesTest/b.txt");
            //SI NO SE PONE EL NOMBRE AL ARCHIVO COMO LOS ANTERIORES EL ARHIVO YA LO RECONOCE COMO EXISTENTE
            Path directory = Paths.get("C:/Users/pablo/Desktop/Courses");
            //FILE ALREADY EXISTS EXCEPTION
            Files.copy(currentFile, outputFile);
            Files.copy(outputFile, directory);
            Files.delete(outputFile);
        }
        catch (Exception e){
            String message= e.getMessage();
            System.out.println(message);
        }
    }
}
