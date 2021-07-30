package com.java.certification.questions.Collecciones;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet {

    public static void main(String[] args) {

        //Lo ordena porque implementa la interfaz comparable
        TreeSet<String> ordenaPersonas=new TreeSet<>();
        ordenaPersonas.add("Pablo");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Juliana");
        ordenaPersonas.add("Diana");

        for (String personas:ordenaPersonas
             ) {
                System.out.println(personas);
        }
        System.out.println("**********************************************************************");
        Articulo articulo=new Articulo(5,"Art1");
        Articulo articulo1=new Articulo(1,"Art2");
        Articulo articulo2=new Articulo(2,"Art3");

        TreeSet<Articulo> articulos=new TreeSet<>();
        articulos.add(articulo);
        articulos.add(articulo1);
        articulos.add(articulo2);


        for (Articulo articulosList: articulos
             ) {
            System.out.println(articulosList.getNumArticulo()  + "-" + articulosList.getDescripcion());
        }
        System.out.println("**********************************************************************");
        //SE LE PASA UNA INSTANCIA DE LA CLASE PARA QUE EL TREESET RECIBA EL COMPARATOR
        Articulo comparadorArticulo= new Articulo();
        //ESTO LO QUE HACE ES VINCULAR EL COMPARE QUE ESTA IMPLEMENTANDO EN LA CLASE ARTICULO Y LO ORDENARA POR ORDEN ALFABETICO
        TreeSet<Articulo> ordenaArticuloDos=new TreeSet<Articulo>(comparadorArticulo);

        ordenaArticuloDos.add(articulo);
        ordenaArticuloDos.add(articulo1);
        ordenaArticuloDos.add(articulo2);

        for (Articulo articulosList: ordenaArticuloDos
        ) {
            System.out.println(articulosList.getNumArticulo()  + "-" + articulosList.getDescripcion());
        }
        System.out.println("**********************************************************************");
        // IMPLEMENTANDO EL METODO CON LA CLASE QUE IMPLEMENTA EL COMPARETOR
       // TreeSet<ArticuloSinImplementarComparator> ordenaArticuloDosSinComparator=new TreeSet<ArticuloSinImplementarComparator>(new Comparator<ArticuloSinImplementarComparator>() {

            //IMPLEMENTANDO EL METODO DESDE EL MISMO TREE SET
        TreeSet<ArticuloSinImplementarComparator> ordenaArticuloDosSinComparator=new TreeSet<ArticuloSinImplementarComparator>(new Comparator<ArticuloSinImplementarComparator>() {
            @Override
            public int compare(ArticuloSinImplementarComparator o1, ArticuloSinImplementarComparator o2) {
                String descripcionA=o1.getDescripcion();
                String descripcionB=o2.getDescripcion();
                return descripcionA.compareTo(descripcionB);
            }
        });

        ArticuloSinImplementarComparator articuloSinImplementarComparator1=new ArticuloSinImplementarComparator(5,"Art1");
        ArticuloSinImplementarComparator articuloSinImplementarComparator2=new ArticuloSinImplementarComparator(1,"Art2");
        ArticuloSinImplementarComparator articuloSinImplementarComparator3=new ArticuloSinImplementarComparator(2,"Art3");

        ordenaArticuloDosSinComparator.add(articuloSinImplementarComparator1);
        ordenaArticuloDosSinComparator.add(articuloSinImplementarComparator2);
        ordenaArticuloDosSinComparator.add(articuloSinImplementarComparator3);

        for (ArticuloSinImplementarComparator articulosSinComparador:ordenaArticuloDosSinComparator
             ) {

            System.out.println(articulosSinComparador);
        }

    }
}
//El problema de implementar esta interfaz es que nos obliga a hacerlo para cambiar nuestro compare to y que el compare to solo va a
//funcionar por un elemento, en este caso con el numArticulo y no por descripcion
class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int numArticulo;
    private String descripcion;

    public Articulo(){}
    public Articulo(int num, String desc){
        this.numArticulo=num;
        this.descripcion=desc;
    }

    public int getNumArticulo() {
        return numArticulo;
    }

    public void setNumArticulo(int numArticulo) {
        this.numArticulo = numArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //metodo que organiza por num articulo
    @Override
    public int compareTo(Articulo o) {
        return numArticulo-o.numArticulo;
    }
    //metodo que organiza por orden alfabetico
    @Override
    public int compare(Articulo o1, Articulo o2) {
        String descripcionA=o1.getDescripcion();
        String descripcionB=o2.getDescripcion();
        return descripcionA.compareTo(descripcionB);
    }


}


class ArticuloSinImplementarComparator implements Comparable<ArticuloSinImplementarComparator> {

    private int numArticulo;
    private String descripcion;

    public ArticuloSinImplementarComparator(){}
    public ArticuloSinImplementarComparator(int num, String desc){
        this.numArticulo=num;
        this.descripcion=desc;
    }

    public int getNumArticulo() {
        return numArticulo;
    }

    public void setNumArticulo(int numArticulo) {
        this.numArticulo = numArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //metodo que organiza por num articulo
    @Override
    public int compareTo(ArticuloSinImplementarComparator o) {
        return numArticulo-o.numArticulo;
    }



}

//SE CREA CLASE QUE IMPLEMENTA EL COMPARADOR Y VA A HACER LO MISMO QUE SE HACIA CUANDO SE IMPLEMENTABA COMPARATOR EN LA CLASE ARTICULO
//SOBRE ESCRIBIENDO EL METODO COMPARE DE LA MISMA FORMA
class ComparadorArticulos implements Comparator<ArticuloSinImplementarComparator>{

    @Override
    public int compare(ArticuloSinImplementarComparator o1, ArticuloSinImplementarComparator o2) {
        String descripcionA=o1.getDescripcion();
        String descripcionB=o2.getDescripcion();
        return descripcionA.compareTo(descripcionB);
    }
}
