package com.java.certification.questions.Q36;

@FunctionalInterface
public interface MyInterface1 {
    public int method();
    private void  pMethod(){

    }
}
@FunctionalInterface
interface MyInterface2{
    public static void sMethod(){

    };
    public boolean equals();

}
interface MyInterface3{
    public void method(String str);
    public void  method();

}
interface MyInterface4{
 /*public void  dMethod(){

    }*/

    public void  method();
}
interface MyInterface5{
    //public static void sMethod();
    public void method(String str);
}