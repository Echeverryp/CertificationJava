package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class MainExampleUBOp {

    public static void main(String[] args) {


        //BINARY OPERATOR

        BinaryOperator<String> binaryOperator=(text,word)->text.replace(word,"");

        var text= "tres tristes tigres comian trigo en un trigal";

        var word="tr";
        BinaryOperator<String> prueba=(a,b)->a.toString();

        System.out.println(binaryOperator.apply(text,word));

        BinaryOperator<Integer> binaryOperator1= BinaryOperator.maxBy(Integer::compareTo);
        BinaryOperator<Integer> binaryOperator2= BinaryOperator.minBy(Integer::compareTo);

        System.out.println(binaryOperator1.apply(1,2));
        System.out.println(binaryOperator2.apply(2,3));

        //UNARY OPERATOR
        //LO MISMO QUE RECIBEN, ES LO MISMO QUE DEVUELVEN
        //UnaryOperator<String> unaryOperator=(a)->a.toLowerCase();
        //UnaryOperator<Integer> unaryOperator=a->a;
        List<String> inmLst = List.of("-juan-","-Laura","-Rosa-","-Pedro-"," -Eloy- ");

        usingUnaryOperator(String::toUpperCase,inmLst).forEach(System.out::println);
        System.out.println();
        usingUnaryOperator(String::toLowerCase,inmLst).forEach(System.out::println);
        System.out.println();

        usingUnaryOperatorAndThen(String::toUpperCase,String::strip, inmLst).forEach(System.out::println);

    }

    private static <T> List<T> usingUnaryOperator(UnaryOperator<T> unOp, List<T> lst){

        List<T> newList = new ArrayList<>();
        lst.forEach(element->newList.add(unOp.apply(element)));
        return newList;
    }

    private static <T> List<T> usingUnaryOperatorAndThen(UnaryOperator<T> unOp,
                                                         UnaryOperator<T> unOp1,
                                                         List<T> lst){

        List<T> newList = new ArrayList<>();
        lst.forEach(element->newList.add(unOp.andThen(unOp1).apply(element)));
        return newList;
    }
}
