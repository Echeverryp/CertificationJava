package com.java.certification.questions.ProgramacionGenericaConHerencia;
//public class ClaseGenerica <U>
//public class ClaseGenerica <K>
public class ClaseGenericaHerencia<T>{

    private T primero;

    public ClaseGenericaHerencia(){
        primero=null;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    //CON EL TIPO COMODIN PODEMOS RECIBIR UN TIPO EMPLEADO O CUALQUIER SUBCLASE QUE EXTIENDA DE EL
    public static void imprimirTrabajador(ClaseGenericaHerencia<? extends Empleado> p){
        Empleado primero=p.getPrimero();

        System.out.println(primero);
    }

    //SIN EL TIPO COMODIN NO PODRIAMOS PASARLE CLASES QUE HEREDEN DE EMPLEADO
   /* public static void imprimirTrabajador(ClaseGenericaHerencia<Empleado> p){
    Empleado primero=p.getPrimero();

    System.out.println(primero);
    }*/

}
