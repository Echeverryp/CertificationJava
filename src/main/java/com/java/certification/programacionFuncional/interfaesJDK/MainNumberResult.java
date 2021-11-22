package com.java.certification.programacionFuncional.interfaesJDK;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MainNumberResult {

    public static void main(String[] args) {
        List<ProductX> lst= Arrays.asList(
                new ProductX("Producto 1" , "123","Hierro",LocalDate.parse("2020-01-08"),123f ),
                new ProductX("Producto 2" , "1234","Hierro Blanco",LocalDate.parse("2020-01-08"),123f ),
                new ProductX("Producto 3" , "12345","Hierro Negro",LocalDate.parse("2020-03-08"),1234f ),
                new ProductX("Producto 4" , "123456","Hierro Gris",LocalDate.parse("2020-02-08"),12345f )
        );

        //GENERA PRODUCTOS DE FORMA INFINITA CON UN SUPLIER
        /*Supplier<ProductX> test=()->new ProductX("Producto 4" , "123456","Hierro Gris",
                LocalDate.parse("2020-02-08"),12345f );
        Stream.generate(test).forEach(a-> System.out.println(a.getName()));*/

        lst.stream().count();

        lst.stream().distinct().count();

        lst.stream().map(ProductX::getName).distinct().count();

        var average = lst.stream().mapToDouble(ProductX::getPrice).average().getAsDouble();

        var averageInt = lst.stream().mapToInt(prod->LocalDate.from(prod.getExpirationDate()).getYear()).average().getAsDouble();

        var sum = lst.stream().mapToDouble(ProductX::getPrice).sum();

    }
}
