package com.java.certification.questions.ProgramacionGenericaConHerencia;

public class HerenciaGenericaMain {

    public static void main(String[] args) {

        /*Empleado empleado=new Empleado("Elena",45,15000);

        Jefe directoraComercial=new Jefe("Juliana",50,200000);

        Empleado nuevoEmpleado=directoraComercial;*/

        ClaseGenericaHerencia <Empleado> Administrativa=new ClaseGenericaHerencia<>();


        ClaseGenericaHerencia<Jefe> directoraComercial=new ClaseGenericaHerencia<>();

        //ClaseGenericaHerencia<Empleado> empleadoNuevo= directoraComercial;

        ClaseGenericaHerencia.imprimirTrabajador(Administrativa);

        ClaseGenericaHerencia.imprimirTrabajador(directoraComercial);

    }
}
