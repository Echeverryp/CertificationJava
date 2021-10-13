package com.java.certification.part2.Q18Estudiar;

import java.util.ArrayList;
import java.util.List;

public class Q18 {

    public static void main(String[] args) {
        List<? extends Number> list=new ArrayList<Byte>();
        List<? super Short> list2=new ArrayList<Number>();
    }
}
