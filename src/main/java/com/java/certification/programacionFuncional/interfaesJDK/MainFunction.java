package com.java.certification.programacionFuncional.interfaesJDK;

import java.time.LocalDate;
import java.util.function.Function;

public class MainFunction {

    public static void main(String[] args) {

        Function<StringBuilder, String> toString=in->in.append("Function").toString();
        var chain = new StringBuilder("Usando la interface ");
        System.out.println( usingFunction(toString, chain));

        var birthDay= LocalDate.of(1998,3,23);

        Function<LocalDate,Integer> returnAge =date->date.until(LocalDate.now()).getYears();

        Function <Integer,Sub> returnSub = Sub::new;
        //Function <Integer,Sub> returnSub = age->new Sub(age);
        Function <Sub, String> returnToString =sub->sub.toString();

        System.out.println(usingFunctionWithCompose(returnToString,returnSub,returnAge,birthDay));

        var sub=new Sub(20);

        Function <Sub, Integer>returnAge1=sb->sb.getAge();

        Function <Integer,LocalDate> returnBirth = age->{
            var now =LocalDate.now();
            return LocalDate.of(now.getYear(), now.getMonth(),now.getDayOfMonth());
        };

        Function <LocalDate, String>returnString=ld->ld.toString();


        System.out.println(usingFuncWithAndThen(returnAge1,returnBirth,returnString,sub));
    }

    private static <T,R,V,O> O usingFuncWithAndThen(Function<T,R> fun,Function<R,V> fun1,
                                                    Function<V,O> fun2, T value){
        return fun.andThen(fun1).andThen(fun2).apply(value);
    }

    private static <T,R,V,O> R usingFunctionWithCompose(Function<T,R> fun,Function<V,T> fun1,
                                              Function<O,V> fun2, O value){
        return fun.compose(fun1).compose(fun2).apply(value);
    }

    private  static  <T,R> R usingFunction(Function<T,R> fun, T value){
        return fun.apply(value);
    }
}
