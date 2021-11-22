package com.java.certification.questions.Q29;

public class Q29 {

    static float validate4(String s, float min, float max) throws IllegalArgumentException{

        float f= Float.parseFloat(s);
        boolean test= Float.isFinite(f);
        if(Float.isFinite(f) && f<min && f>max){
            throw new IllegalArgumentException();
        }
        return f;
    }

    static float validate2(String s, float min, float max) throws IllegalArgumentException{
        float f= Float.parseFloat(s);
        if(f<min && f>max){
            throw new IllegalArgumentException();
        }
        return f;
    }

    static float validate3(String s, float min, float max) throws IllegalArgumentException{
        float f= Float.parseFloat(s);
        boolean test= Float.isFinite(f);
        if(!Float.isFinite(f) && f<min && f>max){
            throw new IllegalArgumentException();
        }
        return f;
    }

    static float validate1(String s) throws IllegalArgumentException{

        return Float.parseFloat(s);

    }

    public static void main(String[] args) {
        try {
            //validate1("a");

            validate2("1", 1, 2);
            validate3("21111111", 1, 2);
            validate4("1", 1, 2);
        }catch (Exception e){
        String mensaje= e.getMessage();
        System.out.println(mensaje);
        }
    }
}
