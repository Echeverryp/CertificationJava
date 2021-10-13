package com.java.certification.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

    public static void main(String[] args) {

        ArrayList<String> blist = new ArrayList<>(List.of("A", "B", "C", "D"));  // Line 1
        blist.toArray();
        String[] bArray = blist.toArray(new String[5]);   // Line 2

        ArrayList<String> clist = new ArrayList<String>(List.of(bArray));   // Line 3

        clist.add("E");
        System.out.println(clist);
    }
}
