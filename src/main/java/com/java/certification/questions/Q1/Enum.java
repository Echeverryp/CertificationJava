package com.java.certification.questions.Q1;

enum Enum {
    MINI("A"),MEDIANO("B"),GRANDE("C"),MUY_GRANDE("D");

    protected String s;

    Enum(String s) {
        this.s=s;
    }

    protected String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
