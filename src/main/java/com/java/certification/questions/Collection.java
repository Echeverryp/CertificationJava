package com.java.certification.questions;

import java.util.*;

public class Collection {

    public static void main(String[] args) {


        //****************************************************LIST INTERFACE******************************************************
        //ARAYLIST
        //La clase ArrayList implementa la interfaz List. Utiliza una matriz dinámica para almacenar el elemento duplicado
        // de diferentes tipos de datos. La clase ArrayList mantiene el orden de inserción y no está sincronizada.
        // Se puede acceder de forma aleatoria a los elementos almacenados en la clase ArrayList. Considere el siguiente ejemplo.


       // La clase ArrayList tiene una matriz regular dentro de ella. Cuando se agrega un elemento, se coloca en la matriz.
        // Si la matriz no es lo suficientemente grande, se crea una nueva matriz más grande para reemplazar la anterior y se
        // elimina la anterior.

       /* Cuándo usar
        Es mejor usar una ArrayList cuando:

        Quieres acceder a elementos aleatorios con frecuencia
        Solo necesita agregar o eliminar elementos al final de la lista
        */
        ArrayList<String> pruebaArrayList=new ArrayList<>();



        pruebaArrayList.add("Ravi");//Adding object in arraylist
        pruebaArrayList.add("Vijay");
        pruebaArrayList.add("Ravi");
        pruebaArrayList.add("Ajay");

        Iterator itr=pruebaArrayList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //OUTPUT
        //Ravi
        //Vijay
        //Ravi
        //Ajay

        //LINKEDLIST
        //LinkedList implementa la interfaz Collection. Utiliza una lista doblemente enlazada internamente para almacenar los elementos.
        // Puede almacenar los elementos duplicados. Mantiene el orden de inserción y no está sincronizado.
        // En LinkedList, la manipulación es rápida porque no se requieren cambios.

       /* Es mejor usar una LinkedList cuando:

        Solo usa la lista recorriendo en bucle en lugar de acceder a elementos aleatorios
        Con frecuencia es necesario agregar y eliminar elementos desde el principio, la mitad o el final de la lista*/
        LinkedList<String> pruebaLinkedList=new LinkedList<>();

        pruebaLinkedList.add("Ravi");
        pruebaLinkedList.add("Vijay");
        pruebaLinkedList.add("Ravi");
        pruebaLinkedList.add("Ajay");

        Iterator itrLinked=pruebaLinkedList.iterator();

        while(itrLinked.hasNext()){
            System.out.println(itrLinked.next());
        }

        //OUTPUT
        //Ravi
        //Vijay
        //Ravi
        //Ajay

        //VECTOR
        //Vector utiliza una matriz dinámica para almacenar los elementos de datos. Es similar a ArrayList.
        // Sin embargo, está sincronizado y contiene muchos métodos que no forman parte del marco de la colección.
        Vector<String> pruebaVector=new Vector<>();

        //VECTORES Se pueden definir como esta abajo especificado, el 20 se refiere al tamaño del vector y el 5 a la cantidad que
        //se va a sumar, cada vez que se rebace el tamaño maximo .. cuando pase de 20 se aumenta a 25 y de 25 a 30
        //Vector vector=new Vector(20, 5);
        //vector.add("");

        //DIFERENCIA CON LOS ARRAYLIST
        /*Sincronización: el vector está sincronizado, lo que significa que solo un subproceso a la vez puede acceder al código,
        mientras que arrayList no está sincronizado, lo que significa que varios subprocesos pueden trabajar en arrayList al
        mismo tiempo. Por ejemplo, si un subproceso está realizando una operación de adición, puede haber otro subproceso realizando
        una operación de eliminación en un entorno de subprocesos múltiples.
        Si varios subprocesos acceden a arrayList al mismo tiempo, entonces debemos sincronizar el bloque del código que
        modifica la lista estructuralmente, o alternativamente permitir modificaciones simples de elementos. La modificación
        estructural significa la adición o eliminación de elementos de la lista. Establecer el valor de un elemento existente
        no es una modificación estructural.

        En el vector , solo puede acceder un hilo, mientras que el arraylist puede tener muchos hilos al tiempo
        El vector es bueno cuando se va a trabajar con un solo hilo, para temas de seguridad
        */
        pruebaVector.add("Ayush");

        pruebaVector.add("Amit");
        pruebaVector.add("Ashish");
        pruebaVector.add("Garima");
        Iterator<String> itrVector=pruebaVector.iterator();
        while(itrVector.hasNext()){
            System.out.println(itrVector.next());
        }
        //OUTPUT
        //Ayush
        //Amit
        //Ashish
        //Garima

        //STACK
        //La pila es la subclase de Vector. Implementa la estructura de datos de último en entrar, primero en salir,
        // es decir, Stack. La pila contiene todos los métodos de la clase Vector y también proporciona sus métodos como
        // boolean push (), boolean peek (), boolean push (objeto o), que define sus propiedades.

        Stack<String> pruebaStack=new Stack<>();

        pruebaStack.push("Ayush");
        pruebaStack.push("Garvit");
        pruebaStack.push("Amit");
        pruebaStack.push("Ashish");
        pruebaStack.push("Garima");
        pruebaStack.pop();

        String test= pruebaStack.get(2);

        Iterator<String> itrStack=pruebaStack.iterator();
        while(itrStack.hasNext()){
            System.out.println(itrStack.next());
        }

        //****************************************************SET INTERFACE******************************************************

        //HASHSET
        //La clase HashSet implementa la interfaz de conjunto. Representa la colección que usa una tabla hash para el
        // almacenamiento. El hash se usa para almacenar los elementos en el HashSet. Contiene elementos únicos.
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itrSet=set.iterator();
        while(itrSet.hasNext()){
            System.out.println(itrSet.next());
        }
        //OUTPUT
        //RAVI
        //VIJAY
        //AJAY

        //LINKEDHASH
        //La clase LinkedHashSet representa la implementación LinkedList de Set Interface.
        // Extiende la clase HashSet e implementa la interfaz Set. Al igual que HashSet, también
        // contiene elementos únicos. Mantiene el orden de inserción y permite elementos nulos.
        LinkedHashSet<String> Linkedset=new LinkedHashSet<String>();
        Linkedset.add("Ravi");
        Linkedset.add("Vijay");
        Linkedset.add("Ravi");
        Linkedset.add("Ajay");
        Iterator<String> itrLinkedset=Linkedset.iterator();
        while(itrLinkedset.hasNext()){
            System.out.println(itrLinkedset.next());
        }
        //OUTPUT
        //RAVI
        //VIJAY
        //AJAY

        //TREESET
        //La clase Java TreeSet implementa la interfaz Set que usa un árbol para el almacenamiento.
        // Al igual que HashSet, TreeSet también contiene elementos únicos. Sin embargo, el tiempo de acceso y recuperación de
        // TreeSet es bastante rápido. Los elementos en TreeSet almacenados en orden ascendente.
        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");

        Iterator<String> itrTreeSet=treeSet.iterator();
        while(itrTreeSet.hasNext()){
            System.out.println(itrTreeSet.next());
        }

        //OUTPUT
        //RAVAI
        //VIJAY
        //AJAY
    }
}
