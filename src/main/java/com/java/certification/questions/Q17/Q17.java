package com.java.certification.questions.Q17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Q17 {

    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>(List.of("apple","orange","banana"));

        UnaryOperator<String> functio=String::toUpperCase;


        fruits.replaceAll(functio);
    }
}
