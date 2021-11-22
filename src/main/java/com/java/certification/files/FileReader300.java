package com.java.certification.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader300 {
    public static void main(String[] args) {
        File file=new File("prueba.txt");


        try {

            //CON SCANNER
            Scanner scan=new Scanner(file);
            //IMPRIME UNA SOLA LINEA
           // System.out.println(scan.nextLine());


            //EXPORTAR EL ARCHIVO
            String fileContent="";
            //IMPRIME TODAS LAS LINEAS
            while (scan.hasNextLine()){
                //System.out.println(scan.nextLine());
                fileContent.concat(scan.nextLine()+"\n");
            }

            try {
                //CREAMOS NUEVO ARCHIVO
                FileWriter fileWriter=new FileWriter("nuevoarchivo.txt");
                fileWriter.write(fileContent);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
