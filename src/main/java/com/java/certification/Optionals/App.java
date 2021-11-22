package com.java.certification.Optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {

    public static Optional<Integer> findElement(Integer[] arr, int x){
        return Arrays.stream(arr).filter(num->num==x).findFirst();
        /*
        for (Integer num:arr
             ) {
            if(num==x){
                return Optional.of(x);
            }
        }

        return Optional.empty();*/
    }
    public static void main(String[] args) {

        Optional<Integer> numExists= Optional.of(5);
        Optional<Integer> numDoesNotExist= Optional.empty();
/*
        if(numExists.isPresent()){
            System.out.println(numExists.get());
        }

        if(numDoesNotExist.isPresent()){
            System.out.println("Is not here");
            System.out.println(numDoesNotExist.get());
        }*/

        Optional<Integer> textNotExist= Optional.ofNullable(5);

        Optional<String> pruebaNull= Optional.ofNullable(null);

        System.out.println(pruebaNull.isEmpty());

        numExists.ifPresent(System.out::print);
        numDoesNotExist.ifPresent(System.out::print);

        findElement(new Integer[]{1,2,3,4,5}, 3).ifPresent(System.out::println);
        findElement(new Integer[]{1,2,3,4,5}, 6).ifPresent(System.out::println);
    }


}
