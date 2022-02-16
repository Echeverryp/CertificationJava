package thirdTime.FunctionalInterfaces.BinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTwo {

    public static void main(String[] args) {

        BinaryOperator<String> binOp=(a,b)-> a.replace(b,"");

        var text= "tres tristes tigres comen trigo en un trigal";

        System.out.println(binOp.apply(text,"tr"));

        BinaryOperator<Integer> biOp2=BinaryOperator.maxBy(Integer::compareTo);

        BinaryOperator<Integer> biOp3=BinaryOperator.minBy(Integer::compareTo);


        System.out.println(biOp2.apply(100,300));
        System.out.println(biOp3.apply(20,100));
    }
}
