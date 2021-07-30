package com.java.certification.questions.Q44;

import java.util.Collection;

public class Y extends X{

    public void print(Object obj){
        System.out.println("["+ obj + "]");
    }
    //NO SE PUEDE POR SER FINAL
   /* public void print(Object ...objects)
    {
        for(Object obj: objects){
            print(obj);
        }
    }*/

    public void print (Collection collectors){
        collectors.forEach(System.out::println);
    }


}
