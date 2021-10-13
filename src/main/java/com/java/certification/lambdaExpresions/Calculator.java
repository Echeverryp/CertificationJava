package com.java.certification.lambdaExpresions;

import java.util.function.IntUnaryOperator;

public class Calculator {

    // We declare a functional interface as part of the class.
    // A functional interface is an interface with one and only one
    // abstract method.
   /* interface UnaryIntegerOperation {
        int calculate(int a);
    }*/

    // We create a 'pass thru'  method, accepting an object which
    // implements our interface as one parameter.  The other parameter
    // is the number we'll be doing the operation on.
    public int calculate(int a, IntUnaryOperator op) {
        return op.applyAsInt(a);
    }

    public static void main(String... args) {
        // We create an instance of our class
        Calculator myApp = new Calculator();

        // We create three objects using lambda expressions

        // This lambda expression demonstrates a single typed parameter in
        // parentheses (if you specify type, you MUST use parentheses)
        // -- This operation will result in the value being squared.
        IntUnaryOperator square = (int a) -> a * a;

        // This lambda expression demonstrates a single untyped parameter in
        // parentheses
        //-- This operation will result in the value being cubed.
        IntUnaryOperator cube = (a) -> a * a * a;

        // This lambda expression demonstrates a single untyped parameter
        // without using parentheses
        //-- This operation will result in the value being incremented by 1.
        IntUnaryOperator increment = a -> a + 1;

        // Execution
        int value = 2;
        System.out.println("The number (" + value + ") squared = " +
                myApp.calculate(value, square));

        System.out.println("The number (" + value + ") cubed = " +
                myApp.calculate(value, cube));

        System.out.println("The number (" + value + ") incremented = " +
                myApp.calculate(value, increment));

        // This lambda expression demonstrates a single untyped parameter
// without using parentheses, but our body is wrapped in brackets
// and we use a return statement
//-- This operation will result in the value being decremented by 1.
        IntUnaryOperator decrement = a -> {
            return a - 1;
        };

        System.out.println("The number (" + value + ") decremented = " +
                myApp.calculate(value, decrement));
    }
}