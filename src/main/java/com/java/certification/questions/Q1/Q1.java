package com.java.certification.questions.Q1;

import java.io.Serializable;

enum Q1 implements Serializable {

    R1(1),R2(2),R3(3);

    int c;


    private Q1(int c) {
        this.c=c;
    }
}
