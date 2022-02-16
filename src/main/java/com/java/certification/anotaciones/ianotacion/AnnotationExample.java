package com.java.certification.anotaciones.ianotacion;

import com.java.certification.anotaciones.CustomTypeAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@CustomTypeAnnotation(priority = CustomTypeAnnotation.Priority.HIGH, createdBy = "Paep",tags = {"java","annotation"})
public class AnnotationExample {

    @CuestomMethodAnnotation
    String shouldAlwaysBeProcessed(){
            return "This should always be processed";
    }

    @CuestomMethodAnnotation
    void willThrowException() throws Exception {
        throw new Exception("Excepcion lanzada");
    }

    @CuestomMethodAnnotation(enabled = false)
    void shouldNotBeProcessed() throws Exception {
        throw new RuntimeException("Excepcion lanzada");
    }

    public static void main(String[] args) {
        System.out.println("Processing.....");

        int success=0,failed=0,total=0,disabled=0;

        Class<AnnotationExample> obj=AnnotationExample.class;

        if (obj.isAnnotationPresent(CustomTypeAnnotation.class)){
            Annotation annotation=obj.getAnnotation(CustomTypeAnnotation.class);
            CustomTypeAnnotation custom=(CustomTypeAnnotation) annotation;

            System.out.println(custom.createdBy());

            int tagLenght=custom.tags().length;

            for (String tag:custom.tags()
                 ) {
                if(tagLenght>1){
                    System.out.println(tag + ",");
                }
                else{
                    System.out.println(tag);
                }
                tagLenght--;
            }
        }

        for (Method method:obj.getDeclaredMethods()
             ) {
            if(method.isAnnotationPresent(CuestomMethodAnnotation.class)){
                Annotation annotation=method.getAnnotation(CuestomMethodAnnotation.class);

                CuestomMethodAnnotation cuestomMethod= (CuestomMethodAnnotation)annotation;
                if (cuestomMethod.enabled()){
                    String result="n/a";
                    try{
                        result=(String) method.invoke(obj.newInstance());

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }


    }
}
