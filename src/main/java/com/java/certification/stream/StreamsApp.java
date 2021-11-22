package com.java.certification.stream;

import com.java.certification.questions.Q37.A;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamsApp(){
        lista =new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("Jaime");
        lista.add("MitoCode");

        numeros=new ArrayList<>();
        numeros.add("1");
        numeros.add("2");


    }


    public void filtrar(){
        lista.stream().filter(p->p.startsWith("M")).forEach(System.out::println);

    }
    public void ordenar(){
        //lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);

    }
    public void transformar(){
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);
        numeros.stream().map(p->(Integer.parseInt(p)+1)).forEach(System.out::println);


    }

    public void contar(){

        System.out.println(lista.stream().count());

    }
    public void limitar(){
        lista.stream().limit(2).forEach(System.out::println);

    }

    public static void main(String[] args) {
        StreamsApp streamsApp=new StreamsApp();
        //streamsApp.filtrar();
       // streamsApp.ordenar();
        //streamsApp.transformar();
        //streamsApp.limitar();
        streamsApp.contar();
    }
}
