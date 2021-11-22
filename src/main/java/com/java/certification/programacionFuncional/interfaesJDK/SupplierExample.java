package com.java.certification.programacionFuncional.interfaesJDK;

import com.java.certification.Suppliers.HotDog;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<LocalDate> date=()->LocalDate.now();
        var random = new Random();
        Supplier<Integer> randomInt=random::nextInt;
        Supplier<HotDog> hotDog=HotDog::new;
        usingSupplier(date);
        usingSupplier(randomInt);
        usingSupplier(randomInt);
        usingSupplier(randomInt);
        usingSupplier(randomInt);
        usingSupplier(randomInt);
        usingSupplier(hotDog);
    }

    static <T> void usingSupplier(Supplier<T> supplier){
        System.out.println("Hacemos cierto codigo ");
        System.out.println("Se obtien " + supplier.get());

    }
}
