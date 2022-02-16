package com.java.certification.anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class App {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lenguajes{
        Lenguaje[] value() default {};
    }

    @Repeatable(value=Lenguajes.class)
    public @interface Lenguaje{
        String value();
    }

   @Lenguajes(value = {@Lenguaje(value = "Javita"),@Lenguaje(value = "Phyton")})
    public interface LenguajeDeProgramacion{



    }

    public static void main(String[] args) {
        Lenguajes len= LenguajeDeProgramacion.class.getAnnotation(Lenguajes.class);
        for (Lenguaje elemento:len.value()
        ) {
            System.out.println(elemento);

        }

    }
}
