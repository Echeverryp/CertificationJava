package com.java.certification.en;

import java.util.List;
import java.util.function.UnaryOperator;

public enum Machine {

    AUTO("Truck"), MEDICAL("Scanner");
    private String type;
    private Machine(String type) {
        this.type = type;
    }

    private void setType(String type) {
        this.type = type;                               //line 1
    }
    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        UnaryOperator<Integer> prueba=(var a)->(a*2);


        Machine.AUTO.setType("Sedan");
        for (Machine p : Machine.values()) {
            System.out.println(p + ": " + p.getType());     //line 3
        }
    }
}
