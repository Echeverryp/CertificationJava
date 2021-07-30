package com.java.certification.questions.Q38;

import java.io.FileNotFoundException;

public class Q38 {

    public static void main(String[] args) {

        try {
            doA();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void  doA() throws FileNotFoundException, IndexOutOfBoundsException {
        if (false){
            throw new FileNotFoundException();
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }
}
