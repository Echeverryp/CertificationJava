package com.java.certification.lambdaExpresions;

public class AnonymousTest {

    public static void main(String[] args) {
        AnonymousTest a = new AnonymousTest();

        // We declare a local inner class (named) in this method
        class LocalClass extends Object {
            public void hello() {
                System.out.println("Hello Local Class");
            }
        }

        // We immediately execute a method on the local class
        // If this were the only line of code that used the local class,
        // An anonymous class would make more sense.
        new LocalClass().hello();

        // We create an anonymous class as a statement, not a declaration.
        // This one is of type Object (extends Object)
        Object anomClass = new Object() {
            public String toString() {
                return "Hello Anonymous Class";
            }
        };

        // We immediately execute a method on anonymous class
        System.out.println(anomClass.toString());

    }
}