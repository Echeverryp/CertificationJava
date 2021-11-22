package com.java.certification.questions.Q8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Stream;
//IMPRIME UN RESULTADO PERO NO DEVUELVE NADA
public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities= Stream.of("Sydney", "Dhaka", "New York", "London");

        cities.forEach(printConsumer);

        List<String> citiesList = Arrays.asList("Sydney", "Dhaka", "New York", "London");

        Consumer<List<String>> upperCaseConsumer = list -> {
            for(int i=0; i< list.size(); i++){
                list.set(i, list.get(i).toUpperCase());
            }
        };


        Consumer<List<String>> printConsumerList = list -> list.stream().forEach(System.out::println);

        upperCaseConsumer.andThen(printConsumerList).accept(citiesList);


        IntConsumer intConsumer= t->System.out.println(t);
        intConsumer.accept(1);


    }
}
