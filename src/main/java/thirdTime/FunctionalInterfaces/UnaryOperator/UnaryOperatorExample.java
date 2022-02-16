package thirdTime.FunctionalInterfaces.UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        List<String> inmList= List.of("-juan","-pablo","-andres","-david","-fanor","-adriana");

        UnaryOperator<String> uperaCaseOperator=a->a.toUpperCase();

        //System.out.println(uperaCaseOperator.apply("hola"));

        //toUperList(uperaCaseOperator,inmList).stream().forEach(System.out::println);

        UnaryOperator<String> operatorTwo=a->a.length()+"hola";
        toUperListAndThen(uperaCaseOperator,operatorTwo,inmList).stream().forEach(System.out::println);
    }
    
    private static List<String> toUperList(UnaryOperator<String> operator, List<String> lista){
        List<String> listReturn =new ArrayList<>();
        lista.forEach(a->listReturn.add(operator.apply(a)));
        return listReturn;
    }

    private static List<String> toUperListAndThen(UnaryOperator<String> operator, UnaryOperator<String> operatorTwo, List<String> lista){
        List<String> listReturn =new ArrayList<>();
        lista.forEach(a->listReturn.add(operator.andThen(operatorTwo).apply(a)));
        return listReturn;
    }
}
