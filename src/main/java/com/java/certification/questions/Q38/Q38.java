package com.java.certification.questions.Q38;

import javax.xml.xpath.XPathException;
import java.io.FileNotFoundException;

public class Q38 {

    public static void main(String[] args) {

        try {
            doA();
            new XPathException("");
        } catch (Exception  e) {
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
