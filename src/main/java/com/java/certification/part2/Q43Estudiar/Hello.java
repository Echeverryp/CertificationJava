package com.java.certification.part2.Q43Estudiar;


import java.lang.reflect.Method;

public class Hello {

    @AuthorInfo(date="",author = "",comments = "")
    public void func(){

    }
    @MyAnnotation(value=10)
    public void sayHello(){System.out.println("hello annotation");}

    @AuthorInfo(date="",comments = "")
    public void func1(){

    }

    @AuthorInfo(date="")
    public void func2(){

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Hello h=new Hello();
        Method m=h.getClass().getMethod("sayHello");
        MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: "+manno.value());
    }
}
