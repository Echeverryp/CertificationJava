package com.java.certification.questions.Q30;

import java.util.Optional;

public class Q30 {

    public static void main(String[] args) {
        Optional<String> value=createValue();
        String str=value.orElse("Duke");
        System.out.println(str);

    }

    public static Optional<String> createValue(){
        String s=null;
        return Optional.ofNullable(s);
    }
}
