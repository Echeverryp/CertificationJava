package com.java.certification.part2.Q29;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Q29 {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("/u01/work");
            //line1
            BasicFileAttributes attributes= Files.readAttributes(path,BasicFileAttributes.class);
            System.out.println(attributes.isDirectory());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
