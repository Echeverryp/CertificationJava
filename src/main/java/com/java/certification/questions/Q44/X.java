package com.java.certification.questions.Q44;

import java.util.Collection;
import java.util.stream.Collectors;

public class X {

    protected void print (Object obj){
        System.out.println(obj);
    }

    public final void print(Object ...objects)
    {
        for(Object obj: objects){
            print(obj);
        }
    }

    public void print (Collection collectors){
        collectors.forEach(System.out::println);
    }

}
