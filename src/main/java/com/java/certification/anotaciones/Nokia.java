package com.java.certification.anotaciones;

import java.lang.annotation.Annotation;

//Si se pone default no es necesario especificar
@SmartPhone( version=6)
//@SmartPhone( OS="",version=6)
public class Nokia {

    String model;
    int size;

    public Nokia(String model, int size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Nokia nokia=new Nokia("Fire" , 5);
        Annotation an= Nokia.class.getAnnotation(SmartPhone.class);
        SmartPhone s= (SmartPhone) an;
        System.out.println(s.version());



    }
}
