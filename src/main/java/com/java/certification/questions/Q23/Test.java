package com.java.certification.questions.Q23;

 class Super {
     static String greeting() {

         return "Good night";
     }

     String name() {

         return "Harry";
     }
 }
     class Sub extends Super{

         static String greeting(){

             return "Good Morning";
         }
         String name(){

             return "Potter";
         }
     }

 class Test {
    public static void main(String[] args) {
        //Para dar la respuesta correcta a esta pregunta, debe recordar que los miembros estáticos
        // son llamados por el tipo de referencia y los no estáticos por el tipo de objeto.
        Super s=new Sub();
        Sub sub=new Sub();
        //INGRESA AL METODO DEL SUB
        System.out.println(s.name() + " " + s.greeting());
        System.out.println(sub.name() + " " + sub.greeting());
    }
}
