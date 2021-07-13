package com.java.certification.questions.Q8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Predicate In predicate testing, a predicate is actually a judgment function similar to bool's.
 */
public class PredicateTest {

    public static void main(String[] args) {
        //(1) Using the Predicate interface, there is only one test method, passing in a parameter
        // and returning a bool value.
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer > 5){
                    return true;
                }
                return false;
            }
        };

        System.out.println(predicate.test(6));

        System.out.println("********************");

        //(2) Using lambda expression,
        predicate = (t) -> t > 5;
        System.out.println(predicate.test(1));
        System.out.println("********************");

        //(2) Using lambda expression,
        predicate = (t) -> t > 5;
        System.out.println(predicate.test(1));
        System.out.println("********************");

        //PREDICATE WITH ARRAY
        Stream<Integer> stream = Stream.of(1, 23, 3, 4, 5, 56, 6, 6);
        List<Integer> list = stream.filter(predicate).collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("********************");
    }
}
