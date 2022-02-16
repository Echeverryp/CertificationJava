package thirdTime.FunctionalInterfaces.BiFunction;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<String,String , Boolean> contiene= (valueOne,valueTwo)->valueOne.contains(valueTwo);

        System.out.println(UsingBiFunction(
                "Acigueña","eña",contiene
        ));

        BiFunction<List<Integer>,Integer,Boolean> contieneLista=(lista,numero)->lista.contains(numero);

        System.out.println(UsingBiFunction(
                List.of(1,2,3,4,5,6,7,8),
                9,
                contieneLista


        ));
        Function<Boolean,String> funcionSola= bool->bool.toString() + "Valor Retorno";
        System.out.println(UsingBiFunctionAndThen(
                List.of(1,2,3,4,5,6,7,8),
                4,
                contieneLista,funcionSola


        ));
    }

    private static <T,U,R>R UsingBiFunction(T value, U valueTwo, BiFunction<T,U,R> biFunction){

        return biFunction.apply(value,valueTwo);

    }

    private static <T,U,R,O>O UsingBiFunctionAndThen(T value, U valueTwo,
                                            BiFunction<T,U,R> biFunction,
                                            Function<R,O> fun){

        return biFunction.andThen(fun).apply(value,valueTwo);

    }

}
