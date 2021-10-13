package com.java.certification.part2.Q23;

public class GameObject{

    public Object[] move(int x, int y) {
        System.out.println("Move GameObject");
        return new Integer[] {x + 10, y + 10};
    }
}
