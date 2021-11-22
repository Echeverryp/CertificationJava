package com.java.certification.programacionFuncional.interfaesJDK;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class DecimalFormat {

    public static void main(String[] args) throws Exception {
        List<ProductX> lst= Arrays.asList(
                new ProductX("Producto 1" , "123","Hierro", LocalDate.parse("2020-01-08"),123f ),
                new ProductX("Producto 2" , "1234","Hierro Blanco",LocalDate.parse("2020-01-08"),123f ),
                new ProductX("Producto 3" , "12345","Hierro Negro",LocalDate.parse("2020-03-08"),1234f ),
                new ProductX("Producto 4" , "123456","Hierro Gris",LocalDate.parse("2020-02-08"),12345f )
        );

        Comparator< ? super ProductX> comparator=(p1,p2)->p1.getName().compareTo(p2.getName());
        Predicate< ? super ProductX> isHierro=(p1)->p1.getMaterial().equals("Hierro");

        var max= lst.stream().max(comparator).get();

        var maxWithElse= lst.stream().filter(isHierro).max(comparator).orElseThrow(()->new Exception("Error"));

        var min= lst.stream().min(comparator).get();

        lst.stream().filter(isHierro).mapToDouble(ProductX::getPrice).min().getAsDouble();

        lst.stream().filter(isHierro).mapToDouble(ProductX::getPrice).min().orElseGet(()->Double.MIN_VALUE);


        System.out.println("Maximo " + max);
        System.out.println("Maximo " + min);
    }
}
