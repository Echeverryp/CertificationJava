package com.java.certification.files;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var texto="prueba.txt";
       // ManejoDeArchivo.crearArchivo(texto);
        //ManejoDeArchivo.escribirArchivo(texto, "Hola mundo");
       // ManejoDeArchivo.escribirArchivo(texto, "Chao mundo");
       // ManejoDeArchivo.anexarArchivo(texto, "Se anexa informacion");
        ManejoDeArchivo.leerArchivo(texto);
    }
}
