package com.java.certification.Optionals;

import java.util.Optional;

public class OptionalApp {


    public static void probar(String valor){
        Optional op=Optional.empty();
        op.get();
    }


    public static void orElse(String valor){

        //Con el of nullable lo que se hace es evitar que se envie un null pointer exception y al poner
        //El or else , si no se envia algun valor se imprime el predeterminado
       Optional<String> op=Optional.ofNullable(valor);

       String x= op.orElse("predeterminado");
        System.out.println(x     );
    }


    public static void orElseThrow(String valor){
        Optional<String> op=Optional.ofNullable(valor);

       String valorOptional=  op.orElseThrow(NumberFormatException::new);
        System.out.println(valorOptional);
    }


    public static void isPresent(String valor){
        Optional<String> op=Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }
    public static void main(String[] args) {

        orElse(null);
        orElseThrow("nullE");
    }
}
