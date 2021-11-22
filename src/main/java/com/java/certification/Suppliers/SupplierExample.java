package com.java.certification.Suppliers;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<LocalDate> dateSupplier=()->LocalDate.now();
        Supplier<HotDog> hotDog=HotDog::new;
        var random =new Random();

        Supplier<Integer> randomInt=random::nextInt;
        usingSuplier(dateSupplier);
        usingSuplier(randomInt);
        usingSuplier(randomInt);
        usingSuplier(randomInt);
        usingSuplier(hotDog);

    }

    static <T> void usingSuplier(Supplier<T> supplier){

        System.out.println("Hacemos cierto codigo");
        System.out.println("Se obtiene " + supplier.get());
    }
}
