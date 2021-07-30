package com.java.certification.questions.JDBC;

import java.sql.*;

public class Conecta_Prueba {

    public static void main(String[] args) {

        try {
            //CREAR CONEXION
            Connection miConexion= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","adminpablo","admin");

            //CREAR OBJETO STATEMENT
            Statement miStatement=miConexion.createStatement();

            //EJECUTAR SQL
            ResultSet miResulset=miStatement.executeQuery("SELECT * FROM USUARIO");

            //LEER EL RESULSET
            while (miResulset.next()){
                System.out.println(miResulset.getString("IDUSUARIO") + miResulset.getString("NOMBRE"));
            }


        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}
