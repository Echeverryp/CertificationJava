package com.java.certification.Optionals;

import java.util.Optional;

public class OptionalSample {

    public static String result(String valor , String valorOpcional) throws Exception{

        //CONCAT
        /*
        var otherVal=Optional.of(valorOpcional).get();

        var concatOpt=Optional.of(valor).get().concat(otherVal);

        return Optional.of(concatOpt).get();

         */


        //OR ELSE THROW
        /*
        var otherValueOrElseThrow = Optional.ofNullable(valor).orElseThrow(Exception::new);

        return Optional.ofNullable(valor).orElse(otherValueOrElseThrow);

        */

        //FILTER

        return Optional.ofNullable(valor).filter(String::isBlank).orElse(valorOpcional);

       // return Optional.ofNullable(valor).orElseGet(()->{return valorOpcional;});
    }


    public static Integer result2(Integer value, Integer otherValue){
        return Optional.of(Integer.sum(value, otherValue)).filter(sum->sum>0).orElse(-1);
    }

    public static void main(String[] args) {

       // System.out.println(result(null,"oli"));

        System.out.println(result2(-5,2));

    }
}
