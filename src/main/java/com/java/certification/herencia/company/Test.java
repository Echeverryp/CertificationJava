package com.java.certification.herencia.company;


abstract class AbstractClass {

    public static int valor;

    final void myOwnMethod() {  // Line 1
        System.out.println("my own");
    }

    void familyMethod() {
        System.out.println("my family");
        printFamilyTree();  // Line 2
    }

    abstract void printFamilyTree();
}

public abstract class Test extends AbstractClass {  // Line 3
    public static void main(String[] args) {
        int valor=AbstractClass.valor;
        printFamilyTrees();
    }

    protected static void printFamilyTrees() {   // Line 4
        Test.printFamilyTrees();
    }
}