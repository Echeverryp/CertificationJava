package com.java.certification.questions.Q21;

public class Q21 {

    public static void main(String[] args) {
        int x=0;

        //CUAL IMPRIME LO MISMO QUE ESTE
        while(x<10){
            System.out.println(x++);
        }

        //ESTE NO POR QUE IMPRIME HASTA EL 10
        System.out.println("***********************");
        for (int c=0; ;c++){
            System.out.println(c);
            if (c==10){
                break;
            }
        }

        //ESTE PUEDE SER PORQUE IMRPIME MENOR  A 10
        System.out.println("***********************");
        for( int d=0; d<10;){
        System.out.println(d++);
        }

        //ESTE PUEDE SER PORQUE IMRPIME MENOR  A 10
        System.out.println("***********************");
        int b=0;
        for(;b<10;){
            System.out.println(b++);

        }


    }
}
