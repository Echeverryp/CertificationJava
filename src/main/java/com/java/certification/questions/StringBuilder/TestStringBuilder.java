package com.java.certification.questions.StringBuilder;

public class TestStringBuilder {

    public static void main(String[] args) {
       /* String texto= "Hola soy pablo";
        texto+=" Do you wanna fight me? :D" + " , I'm jocking";

        //Diferencia con signo mas , es el rendimiento
        StringBuilder textoBuilder= new StringBuilder();
        textoBuilder.append("Hola soy pablo e").append(" Estamos").append(" Concatenando");
*/
        StringBuilder stringBuilder=new StringBuilder();
        long tiempoInicio= System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(i);
        }
        long tiempoFin= System.nanoTime();
        double  diferencia= (tiempoFin-tiempoInicio);
        System.out.println(diferencia);


        long tiempoInicioString= System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            tiempoInicioString+=i;
        }
        long tiempoFinString= System.nanoTime();
        double  diferenciaString= (tiempoFin-tiempoInicio);
        System.out.println(diferenciaString);

    }
}
