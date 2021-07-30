package com.java.certification.questions.Streams;

import java.io.*;

public class StreamFichero {

    public static void leer(){
        try {
            //STREAM
            //Reader se usa para leer un fichero externo
            FileReader entrada=new FileReader
                    ("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Streams/fichero.txt");
            int c=0;

            while (c!=-1){
                c=entrada.read();
                char letra=(char)c;
                System.out.println(letra);


            }
            entrada.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerConBuffer(){
        try {
            //STREAM
            //Reader se usa para leer un fichero externo
            FileReader entrada=new FileReader
                    ("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Streams/fichero.txt");
            BufferedReader miBuffer=new BufferedReader(entrada);
            String linea="";
            while(linea!=null){
                linea=miBuffer.readLine();
                if (linea!=null) System.out.println(linea);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void escribir(){
        String frase="Esto va a ir en un archivo 2";

        try {
            //Writer se usa para escribir un fichero externo
           // FileWriter escritura=new FileWriter
                  //  ("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Streams/nuevoArchivo.txt");

            //EN CASO DE ESCRIBIR EN UN FICHERO EXISTENTE SE AGREGA UN TRUE AL FINAL DEL FILE WRITER -- EJEMPLO--
              FileWriter escritura=new FileWriter
                                ("C:/Users/pablo/Desktop/Repositoris/JavaCertification/" +
                                        "src/main/java/com/java/certification/questions/Streams/nuevoArchivo.txt",true);
            for(int i=0; i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }

            escritura.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //leer();
        leerConBuffer();
        //escribir();
    }

}

