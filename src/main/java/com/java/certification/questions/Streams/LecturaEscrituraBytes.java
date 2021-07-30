package com.java.certification.questions.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecturaEscrituraBytes {

    public static void crearArchivo(ArrayList<Integer> byteDatos){

        try {
            //CREA COPIA DEL ARCHIVO CON ARREGLO DE BYTES
            FileOutputStream archivo_copiado=new FileOutputStream
                    ("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Streams/minion_copia.jpg");

            for (Integer datos:byteDatos) {
                archivo_copiado.write(datos);
            }

            archivo_copiado.close();
        }
        catch (IOException e){

        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> datos_entrada_array=new ArrayList<>();
        try {
            //LEE EL ARCHIVO CON FILE INPUT
            FileInputStream archivo_lectura=new FileInputStream
                    ("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Streams/minion.jpg");
        boolean final_arr=false;

        while(!final_arr){
            //GENERA EL BYTE DE LA LECTURA DEL ARCHIVO
            int byte_entrada=archivo_lectura.read();
            System.out.println(byte_entrada);
            if(byte_entrada!=-1){
                datos_entrada_array.add(byte_entrada);
            }
            else{
                final_arr=true;
            }
        }

        archivo_lectura.close();

        crearArchivo(datos_entrada_array);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
