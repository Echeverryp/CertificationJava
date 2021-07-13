package com.java.certification.questions.Q13;

import java.util.ArrayList;
import java.util.List;

public class Q13 {

    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        //CUANDO SE HACE UN COPY OF , LA LISTA SE VUELVE INMUTABLE Y NO SE LE PUEDE AGREGAR VALORES
        List<String> list2=List.copyOf(list1);
        list2.add("C"); //linea que generar error de compilación
        List<List<String>> lists=List.of(list1,list2);
        System.out.println(lists);
    }
}
