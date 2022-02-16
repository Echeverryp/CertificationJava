package com.java.certification.anotaciones;

public @interface CustomTypeAnnotation {

    public enum Priority{
        LOW,MEDIUM,HIGH
    }

    Priority priority() default Priority.MEDIUM;
    String[] tags() default "";
    String createdBy() default "Mick";
    String lastModified() default "07/03/2021";
}
