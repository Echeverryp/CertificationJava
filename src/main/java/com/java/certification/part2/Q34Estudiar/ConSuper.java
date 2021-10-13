package com.java.certification.part2.Q34Estudiar;

public class ConSuper {

    public ConSuper() {
        this(2);
        System.out.println("3");
    }
    public ConSuper(int a) {
        System.out.println(a);
    }
}
/*
El encadenamiento de constructores se produce mediante el uso de la herencia.
La primera tarea de un método constructor de subclase es llamar al método constructor de
su superclase. Esto asegura que la creación del objeto de subclase comience con la inicialización
de las clases por encima de él en la cadena de herencia.

Puede haber cualquier cantidad de clases en una cadena de herencia. Cada método constructor llama
a la cadena hasta que se alcanza e inicializa la clase en la parte superior. Luego, cada clase subsiguiente
a continuación se inicializa a medida que la cadena vuelve a la subclase original. Este proceso se llama
encadenamiento de constructores.

Con base en esto, podemos concluir que al crear: new ConSub (4), implícitamente llamaremos
 al constructor de nuestra clase padre.
 */