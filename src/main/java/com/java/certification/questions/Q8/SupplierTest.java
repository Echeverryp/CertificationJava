package com.java.certification.questions.Q8;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
//DEVUELVE UN VALOR
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Double> doubleSupplier1 = () -> Math.random();
        DoubleSupplier doubleSupplier2 = Math::random;

        LongSupplier longSupplier=() -> 1L;
        BooleanSupplier booleanSupplier=()->false;
        System.out.println(longSupplier.getAsLong());
        System.out.println(booleanSupplier.getAsBoolean());
        System.out.println(doubleSupplier1.get());
        System.out.println(doubleSupplier2.getAsDouble());
    }
}
