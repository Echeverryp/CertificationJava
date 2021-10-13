package com.java.certification.part2.Q27;

public abstract class Q27 {



    private static class Greet {

        protected static void test(){
            System.out.println("Hello world static");
        }
        private void print1() {
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {

        Q27.Greet i = new Greet();
        i.print1();
        i.test();
    }

    /*Declare su clase final: evita la extensión de la clase ya que extender una clase estática no tiene sentido
    Cree el constructor private: evita la creación de instancias por código de cliente, ya que no tiene sentido crear una instancia de una clase estática
    Cree todos los miembros y funciones de la clase static: dado que la clase no se puede instanciar, no se pueden llamar métodos de instancia ni acceder a los campos de instancia
    Tenga en cuenta que el compilador no le impedirá declarar un miembro de instancia (no estático). El problema solo aparecerá si intentas llamar al miembro de la instancia

     */
}

