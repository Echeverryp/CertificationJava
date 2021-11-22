package com.java.certification.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {

    //SI SE PONE DEFAULT, SE PONE UN VALOR POR DEFECTO
    String OS() default "Android";
    int version();
}
