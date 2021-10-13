package com.java.certification.part2.Q7Estudiar;

import java.util.List;
import java.util.Optional;

public class Q7 {

    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> result = numbers.stream().filter(x -> x% 3 != 0).reduce((i, j) -> i + j);
        //EL REDUCE SUMA LOS NUMEROS Y CREA UNA SOLA SALIDA
        //RECORDAR QUE EL % 3 , ES SI LA DIVISIÓN ES CERRADA EN ESTE CASO SERIA 3/3,6/3,9/3
        numbers.stream().filter(x->x% 3!=0).reduce((i,j)->i+j).stream().forEach(System.out::println);
        result.ifPresent(System.out::print);  // line 1
    }
}
