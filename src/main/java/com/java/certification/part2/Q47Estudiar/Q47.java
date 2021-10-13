package com.java.certification.part2.Q47Estudiar;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q47 {

    public static void main(String[] args) {
        String originalPath = "data\\projects\\a-project\\..\\..\\another-project";
        Path path = Paths.get(originalPath);
        System.out.print(path.normalize());
    }

    /*
    https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html

http://tutorials.jenkov.com/java-nio/path.html

Path.normalize()Returns a path that is this path with redundant name elements eliminated.

The normalize() method of the Path interface can normalize a path. Normalizing means that it removes all the . and .. codes in the middle of the path string, and resolves what path the path string refers to. Here is a Java Path.normalize() example:

String originalPath =
        "\\data\\projects\\a-project\\..\\..\\another-project";

Path path1 = Paths.get(originalPath);
System.out.println("path1 = " + path1);

Path path2 = path1.normalize();
System.out.println("path2 = " + path2);
This Path example first creates a path string with a .. code in the middle. Then the example creates a Path instance from this path string, and prints that Path instance out (actually it prints Path.toString()).

The example then calls normalize() on the created Path instance, which returns a new Path instance. This new, normalized Path instance is then also printed out.

Here is the output printed from the above example:

path1 = data\projects\a-project\..\another-project
path2 = data\another-project
     */
}
