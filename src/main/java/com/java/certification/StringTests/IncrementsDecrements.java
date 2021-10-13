package com.java.certification.StringTests;

public class IncrementsDecrements {

    public static void main(String[] args) {

        int b=5;
        int loopiterations=0;

        while(--b>0){
            loopiterations++;
        }

        System.out.println("Prefix decrement operator used, loopiterations = " + loopiterations + " , b= " + b);

        b=5;

        loopiterations=0;

        while(b-->0){
            loopiterations++;
        }
        System.out.println("Postfix decrement operator used, loopiterations= " + loopiterations + " , b = " + b);


        int d=1  , e=-d;

        System.out.println(" d = " + d + " e = " + e);

        d=-1;
        e=-d;
        System.out.println(" d = " + d + "; e " + e);

        d=1;
        e=+d;
        System.out.println(" d = " + d + " ; e = "+ e);

        d=-1;
        e= +d;
        System.out.println(" d = " + d + " ; e = "+ e);

        int bin1=2;
        int bin2= ~bin1;
        System.out.println("bin1=" + bin1 + " ( " + Integer.toBinaryString(bin1) + " ) , " +
                "bin2 = " + bin2 + " (" + Integer.toBinaryString(bin2) + " )");

        boolean myBoolean=false;
        boolean newBoolean = !myBoolean;

        System.out.println("bin1=" + myBoolean + " ( " + Integer.toBinaryString(bin1) + " ) , " +
                "bin2 = " + newBoolean + " (" + Integer.toBinaryString(bin2) + " )");

        int uno=1;//a
        int dos =2;//b
        int tres=3;//c
        int cuatro=4;//D
        int cinco=5;//e
        int seis=6;//F

        int res= uno + cinco * dos -seis/tres%dos;

        int pruebita= tres%dos;
        System.out.println("");

        System.out.println( "result " + (11%10));

        for (int i=0; i<=9; i+=3){

            for (int j = 10; j < 100 ; j+=30) {
                System.out.println( " i ( " + i + " ) % j ( " + j + ") = " +(i%j) );
            }
        }

        System.out.println("Another one");

        //
        for (double i = 0.5; i < 0.55 ; i+=0.025) {
            for (double j = 10; j < 100; j+=30.57) {
                System.out.println( " i ( " + i + " ) % j ( " + j + ") = " +(i%j) );
            }

        }


        int trotando=5;
        int trotandoDos=2;
        if(trotando<5 || trotandoDos>1){
            System.out.println("aqui");
        }

        trotando&=5;
        int trotandotres=5;
        trotandotres=+6;
        System.out.println("aqui" +trotando);

        System.out.println("aqui" +trotandotres);


        //TESTING
        //SIEMPRE DA 0 --number - number--

        int number=10;
        int result=0;

        for (int i = 10; i <=50 ; i+=10) {

            number=i;
            result = --number - number--;
            System.out.println("Resultado " +result + " i result = " + i);
        }


        //TESTING
        //SIEMPRE DA 2 number-- - --number

        int number1=10;
        int result1=0;

        for (int i = 10; i <=50 ; i+=10) {

            number1=i;
            // en este momento number1 es 10 , luego del -- es 9 y como luego se vuelve a decrementar queda 10-8 , el primer
            // 10 se queda como 10 , por que primero se hizo la asignación y luego la decrementación
            result1 = number1-- - --number1;
            System.out.println("Resultado " +result1 + " i result = " + i);
        }


        //TESTING
        //SIEMPRE DA true (number--) == (number+=1))



        int number2=10;
        boolean result2;

        for (int i = 10; i <=50 ; i+=10) {

            number2=i;
            // en este momento number1 es 10 , luego del -- es 9 y como luego se vuelve a decrementar queda 10-8 , el primer
            // 10 se queda como 10 , por que primero se hizo la asignación y luego la decrementación

            result2 = (number2--) == (number2+=1);
            System.out.println("Resultado " +result2 + " i result = " + i);
        }

        //TESTING
        //SIEMPRE DA true 10
        //int number=10; number=number--;
    }
}
