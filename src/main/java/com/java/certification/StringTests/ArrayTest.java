package com.java.certification.StringTests;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[][] spreadsheet = new int[3][];
        spreadsheet[0] = new int[3];
        spreadsheet[1] = new int[]{1, 2, 3}; // Line 1
        System.out.println(Arrays.deepToString(spreadsheet)); // Line 2
    }
}
