package com.java.certification.questions.Q8;

import java.util.function.Function;
import java.util.stream.Stream;
//Function interface is a functional interface.
// One of its functions is to transform input data into output data in another form.
public class FunctionTest {

    public static void main(String[] args) {
        //(1) Using map method, the first parameter of generics is the type before conversion and the second is the type after conversion.

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();//Gets the length of each string and returns
            }
        };

        Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
        Stream<Integer> stream1 = stream.map(function);
        stream1.forEach(System.out::println);

        System.out.println("********************");


    }
}
