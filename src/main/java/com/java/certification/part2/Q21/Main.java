package com.java.certification.part2.Q21;

public class Main {

    static String prefix = "Mondial:";
    private String name = "domainmodel";
    public static String getName() {
        return new Main().name;
    }
    public static void main(String[] args) {

        Main m = new Main();

        System.out.println(Main.getName() + Main.prefix);
        System.out.println(new Main().name + new Main().prefix);
    }
}
