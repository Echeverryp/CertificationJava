package com.java.certification.questions.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaDB {
    public static void main(String[] args) {
        try {
            //CREAR CONEXION
            Connection miConexion= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","adminpablo","admin");

            //CREAR OBJETO STATEMENT
            Statement miStatement=miConexion.createStatement();

            String instruccionSQL= "INSERT INTO USUARIO(IDUSUARIO,NOMBRE,APELLIDO,CEDULA) VALUES ('3','PEPE','PEPE','123')";
            //INSERT , UPDATE Y DELETE (Se puede hacer cualquiera en el sql)
            miStatement.executeUpdate(instruccionSQL);
            System.out.println("Datos insertado");

        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}
