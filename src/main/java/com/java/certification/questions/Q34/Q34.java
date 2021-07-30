package com.java.certification.questions.Q34;

import java.util.ServiceLoader;

enum Q34 {

    A,B,C;




     static String getFirstLetter(){
        return Q34.values()[1].toString();
    }



}

