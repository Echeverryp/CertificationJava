package com.java.certification.questions.FileExample;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PruebaFile {
    public static void main(String[] args) {
        File carpetaPrincipal=new File("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Serializable");

        System.out.println(carpetaPrincipal.getAbsoluteFile());
        System.out.println(carpetaPrincipal.exists());
        String[] archivosCarpetaPrincipal= carpetaPrincipal.list();

        for (String f:archivosCarpetaPrincipal) {
            File fileOne=new File(carpetaPrincipal.getAbsoluteFile(),f);
            System.out.println(f);
            if(fileOne.isDirectory()){
                String[] archivoSubCarpeta=fileOne.list();
            }


        }
    }
}
