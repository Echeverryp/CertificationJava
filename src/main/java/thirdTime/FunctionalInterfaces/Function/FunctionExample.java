package thirdTime.FunctionalInterfaces.Function;

import com.java.certification.programacionFuncional.interfaesJDK.Sub;

import java.time.LocalDate;
import java.util.function.Function;

public class FunctionExample
{
    public static void main(String[] args) {

        var chain=new StringBuilder("Usando la interface");
        Function<StringBuilder,String> toString=in->in.append(" Function").toString();
        //System.out.println(usingFunction(toString,chain));


        var birth= LocalDate.of(1998,3,23);
        Function<LocalDate,Integer> returnAge= date-> date.until(LocalDate.now()).getYears();
        Function<Integer, Sub> returnSub= Sub::new;
        Function<Sub,String> returnToString = Sub::toString;


       // System.out.println(usingFunctWithCompose(returnToString,returnSub,returnAge,birth));

        var sub=new Sub(12);
        Function<Sub, Integer> returnAgeOne=Sub::getAge;
        Function<Integer,LocalDate> returnBirth = age->{
            var now = LocalDate.now();
            return LocalDate.of(now.getYear()-age,now.getMonth(),now.getDayOfMonth());
        };

        Function<LocalDate,String> returnOtherString= date->date.toString();

        System.out.println(usingFunctionWithAndThen(returnAgeOne,returnBirth,returnOtherString
        ,sub));
    }

    private static<T,V,O,R> O usingFunctionWithAndThen(Function<T,R> fun,
                                                       Function<R,V> fun1,
                                                       Function<V,O> fun2,
                                                       T value){
        return fun.andThen(fun1).andThen(fun2).apply(value);

    }

    private static <T,R> R usingFunction(Function<T,R> fun, T value) {
        return fun.apply(value);
    }

    //Con el compose va alreves, comienza con fun 2 y como el fun 2 devuelve "V"
    //fun1 recibe el "V" como entrada y devuelve T para que fun reciba T que es la salida
    //de fun1 y devuelva R que es lo que devuelve nuestro metodo
    private static<T,V,O,R> R usingFunctWithCompose(Function<T,R> fun,
                                              Function<V,T> fun1,
                                              Function<O,V> fun2,
                                                    O value){
        return fun.compose(fun1).compose(fun2).apply(value);
    }
}
