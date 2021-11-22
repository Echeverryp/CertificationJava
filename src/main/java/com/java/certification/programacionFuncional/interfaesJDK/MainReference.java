package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainReference {

    public static void main(String[] args) {

        var string ="Esternocleidomastoideo";

        var instance = new MainReference();
        Supplier<String> instanceMethod= string::toUpperCase;
        System.out.println(instanceMethod.get());

        Supplier<String> instanceMethod2= instance::get;
        System.out.println(instanceMethod2.get());


        Supplier<String> instanceMethod3= instance::getReferencedMethod;
        System.out.println(instanceMethod3);

        Supplier<MainReference> constructorReference =MainReference::new;
        System.out.println(constructorReference.get().toString());

        Predicate<String> staticMethod= Objects::isNull;
        System.out.println(staticMethod.test(null));
    }

    public String getReferencedMethod(){
        Supplier<String> supplier=this::get;
        return supplier.get().concat("----> llamado con this");
    }

    public String get(){
        return "Cualquier cosa";
    }

    @Override
    public String toString() {
        return "Soy una instancia de la clase MainReference";
    }
}
