package com.java.certification.questions.Q23;

 class Super {
     static String greeting() { return "Good night";}

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
        Super s=new Sub();
        //INGRESA AL METODO DEL SUB
        System.out.println(s.name() + " " + s.greeting());
    }
}
