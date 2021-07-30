package com.java.certification.questions.Optionals;

import java.util.Optional;

public class TestOptionals {
    //Optional evita los errores de null pointer

    public static void probar(String valor){
        System.out.println(valor.contains("mito"));
    try {
    Optional op = Optional.empty();
    op.get();
    }catch (Exception e){

    }
    }

    public static void orElse(String valor){
        //SI SE PONE OF NULLABLE , ES PORQ ACEPTA NULLOS , SI SE PONE OPTIONAL.OF , SACARA UN ERROR DE NULL POINTER
        Optional<String> op=Optional.ofNullable(valor);

        //SI ES NULLO, se le pasa a la variable este valor
        String s=op.orElse("predeterminado");
        System.out.println(s);
    }

    public static void orElseThrow(String valor){
        //SI SE PONE OF NULLABLE , ES PORQ ACEPTA NULLOS , SI SE PONE OPTIONAL.OF , SACARA UN ERROR DE NULL POINTER
        Optional<String> op=Optional.ofNullable(valor);
        //PARA LANZAR UNA EXCEPTION SI EL VALOR ES NULO
        op.orElseThrow(NumberFormatException::new);
    }

    public static void isPresent(String valor){
        //SI SE PONE OF NULLABLE , ES PORQ ACEPTA NULLOS , SI SE PONE OPTIONAL.OF , SACARA UN ERROR DE NULL POINTER
        Optional<String> op=Optional.ofNullable(valor);
        //SI ES NULO VA A SACAR FALSE, SI TIENE UN VALOR SACA TRUE
        System.out.println(op.isPresent());
    }

    public static void main(String[] args) {
        orElse("null");
    }
}
