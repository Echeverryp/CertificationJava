package com.java.certification.part2.Q44;

import java.util.List;

public class Q44 {

    public static void main(String[] args) {
        var numbers = List.of(0,1,2,3,4,5,6,7,8,9);

        double avg=numbers.parallelStream().mapToInt(m->m).average().getAsDouble();
        double avgDos=numbers.stream().mapToInt(m->m).average().getAsDouble();
        double avgTres=numbers.stream().parallel().mapToInt(m->m).average().getAsDouble();

    }
}
