package com.java.certification.questions.Lists;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");

        for (String treeSetList:treeSet
             ) {
            System.out.println(treeSetList);
        }

        //Los ordena de forma alfabetica
        //OUTPUT
        //RAVAI
        //VIJAY
        //AJAY


        TreeSet<Integer> treeSetInteger=new TreeSet<Integer>();
        treeSetInteger.add(3);
        treeSetInteger.add(2);
        treeSetInteger.add(1);
        treeSetInteger.add(4);

        //Los ordena de menor a mayor
        for (Integer treeSetIntegerTest:treeSetInteger
        ) {
            System.out.println(treeSetIntegerTest);
        }
        Articulo articulo=new Articulo(1,"Dec 1");
        Articulo articulo2=new Articulo(2,"Dec 2");
        Articulo articulo3=new Articulo(3,"Dec 3");
        TreeSet<Articulo> treeSetArt=new TreeSet<Articulo>();
        treeSetArt.add(articulo);
        treeSetArt.add(articulo2);
        treeSetArt.add(articulo3);

        for (Articulo artFor: treeSetArt
             ) {
            System.out.println(artFor.getDescripcion());
        }


    }

    static class Articulo implements Comparable<Articulo>{

        private int numero_articulos;
        private String descripcion;

        public Articulo(int num,String desc){
            this.numero_articulos=num;
            this.descripcion=desc;

        }

        public int getNumero_articulos() {
            return numero_articulos;
        }

        public void setNumero_articulos(int numero_articulos) {
            this.numero_articulos = numero_articulos;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        @Override
        public int compareTo(Articulo o) {
            return numero_articulos-o.numero_articulos;
        }
    }
}
