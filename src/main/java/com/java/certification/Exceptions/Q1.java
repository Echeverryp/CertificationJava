package com.java.certification.Exceptions;

public class Q1 {

    /*

Respuesta correcta: como una instrucción if / else, una cláusula try / catch se trata como
una inicialización parcial si todas las secciones no inicializan una variable. La variable i permanece
sin inicializar cuando se ejecuta la cláusula finalmente. Si se inicializara a cero cuando se declaró,
 A sería correcto.
     */
    public static void main(String[] args) {
        int i;
        try {
            i = 0;
            System.out.println("i =" + 10 / i++);
        } catch (RuntimeException e) {

        } finally {
           // System.out.println("i = " + i);
        }
    }
}
