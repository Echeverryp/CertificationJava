package com.java.certification.part2.Q8;

public class Test {

    private int sum;

    public int compute() {
        int x = 0;
        while (x < 3) {
            sum += ++x;
        }
        return sum/4;
    }
    public static void main(String[] args) {
        //si se usa la misma instancia, seguira manejando los valores de la variable anterior
        Test t = new Test();
        int sum = t.compute();
        sum = t.compute();
        t.compute();
        System.out.println(sum);
    }
}
