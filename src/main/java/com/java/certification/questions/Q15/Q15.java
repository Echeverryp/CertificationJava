package com.java.certification.questions.Q15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q15 {

    public static void main(String[] args) {
        try{
            Path path= Paths.get("C:/Users/pablo/Desktop/Courses/FilesTest/w.txt");
            boolean result= Files.deleteIfExists(path);
            if(result) System.out.println(path+ "File was deleted");
            else System.out.println(path + "File does not exist");


        }catch (Exception e){
            String message= e.getMessage();
            System.out.println(message);
        }
    }
}
