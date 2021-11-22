package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MainPredicate {

    public static void main(String[] args) {

        //BIPREDICATE

        BiPredicate<Integer,Integer> isGreater= MainPredicate::isHigher;
        System.out.println("Es mayor el primer numero ?: " + isGreater.test(1,2) );
        System.out.println("Es menor el primer numero ?: " + isGreater.negate().test(1,2) );
        //PREDICATE
        Predicate<Float> isGreaterThanZero= value-> value>0;

        Predicate<Float> isLessThan4000=value->value<4000;

        Predicate<Float> orPredicate=value->Float.isInfinite(value);

        Predicate<Float> notPredicate=Predicate.not(isGreaterThanZero);

        var valide=usinPredicateThenOr(12323f,isGreaterThanZero,isGreaterThanZero,orPredicate)
                ?"Valor Aceptado":"Valor Rechazado";


        Predicate<Object> isString= (a)->a instanceof String;
        var resultado=usinPredicate("Un String", isString)?"Es un String":"No es un String";
        System.out.println(resultado);

    }

    private static boolean isHigher(Integer greater, Integer less){
        return greater>less;
    }
    private static <T> boolean usinPredicate(T value, Predicate<T> predicate){
        return predicate.test(value);
    }

    private static <T> boolean usinPredicateThenOr(T value,
                                             Predicate<T> predicate,
                                             Predicate<T> andPredicate,
                                             Predicate<T> orPredicate){
        return predicate.and(andPredicate).or(orPredicate).test(value);
    }


}
