package com.java.certification.questions.Q50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Test {

    public static void main(String[] args) {

        BiPredicate<Path, BasicFileAttributes> pred = (path, fileAttrs) -> {
            return fileAttrs.isDirectory();
        };
        int depth = 1;
        try (
                var stream = Files.find(Paths.get("C:/Users/pablo/Desktop/Repositoris/JavaCertification/src/main/java/com/java/certification/questions/Q50/continent"), depth, pred)) {
            stream.forEach(System.out::println);
        } catch (IOException e) { }
    }
}
