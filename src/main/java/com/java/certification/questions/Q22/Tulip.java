package com.java.certification.questions.Q22;

public class Tulip extends Plant{

    public static void main(String[] args) {

        Plant plant=new Tulip();
        feed(plant);
        feed(plant);
        Integer prueba=5;
        prueba(prueba);
        Plant plantT=new Plant();
        feed(plantT);

    }
    static void prueba(Integer prueba){
        prueba=0;
    }

    public static void feed(Plant plant){
        if(plant instanceof Tulip){

            System.out.println("Take care of");
        }
        plant = null;
    }
}
