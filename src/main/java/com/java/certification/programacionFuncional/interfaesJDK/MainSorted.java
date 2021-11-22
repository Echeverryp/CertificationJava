package com.java.certification.programacionFuncional.interfaesJDK;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainSorted {

    public static void main(String[] args) {
        List<ProductX> lst= Arrays.asList(
                new ProductX("Producto 1" , "123","Hierro", LocalDate.parse("2020-01-08"),123f ),
                new ProductX("Producto 2" , "1234","Hierro Blanco",LocalDate.parse("2020-01-08"),123f ),
                new ProductX("Producto 3" , "12345","Hierro Negro",LocalDate.parse("2020-03-08"),1234f ),
                new ProductX("Producto 4" , "123456","Hierro Gris",LocalDate.parse("2020-02-08"),12345f )
        );

       // Stream.of(123,2233,123,234,3445,2,312,1).sorted().forEach(System.out::println);

        //Stream.of(123,2233,123,234,3445,2,312,1).sorted(Comparator.reverseOrder()).forEach(System.out::println);


      // lst.stream().sorted().limit(3).forEach(System.out::println);

       //Obtener ultima posicion //el skip omite las posiciones anteriores
        lst.stream().sorted().skip(lst.size()-1).forEach(System.out::println);

        //Filter con comparator de fecha
        Comparator<? super ProductX> comparator= (p1,p2)->p1.getExpirationDate().compareTo(p2.getExpirationDate());
        lst.stream().sorted(comparator.reversed()).limit(3).forEach(System.out::println);



        //Filter con comparing fecha
        lst.stream().sorted(Comparator.comparing(ProductX::getName)).limit(3).forEach(System.out::println);


    }
}
