package com.java.certification.programacionFuncional.interfaesJDK;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MainBiFunction {

    public static void main(String[] args) {


        //System.out.println(usingBiFunction("Acigueña","eñaa",String::contains));

        /*System.out.println(""+
                usingBiFunction(
                        List.of(1,2,3,4,5,6,7,8),
                5,
                List::contains));*/


        System.out.println(usingBiFunctionAndThen(
                "Acigueña",
                "eñaa",
         String::equals,
        MainBiFunction::sendResponse));
    }

    private static String sendResponse(boolean e){
        return e ? "Son iguales" : "Son diferentes";
    }
    private static <T,U,R> R usingBiFunction(T value, U value2, BiFunction<T,U,R> bifun){
        return bifun.apply(value,value2);
    }

    private static <T,U,R,O> O usingBiFunctionAndThen(T value, U value2, BiFunction<T,U,R> bifun, Function<R,O> fun){
        return bifun.andThen(fun).apply(value,value2);
    }
}
