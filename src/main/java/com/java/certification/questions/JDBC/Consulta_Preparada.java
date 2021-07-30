package com.java.certification.questions.JDBC;

import java.sql.*;

public class Consulta_Preparada {


    public static void main(String[] args) {

        try {
            //CREAR CONEXION
            Connection miConexion= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","adminpablo","admin");

            PreparedStatement miSentencia=miConexion.prepareCall("SELECT * FROM USUARIO WHERE IDUSUARIO=? AND NOMBRE=?");

            miSentencia.setString(1,"1");
            miSentencia.setString(2,"PAEP");
            ResultSet rs=miSentencia.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("IDUSUARIO") + rs.getString("NOMBRE"));
            }

            rs.close();
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}
