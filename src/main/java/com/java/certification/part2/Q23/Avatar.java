package com.java.certification.part2.Q23;

public class Avatar extends GameObject{
    public Object[] move (Number x, Number y) {
        System.out.println("Move character");
        return super.move(x.intValue(), y.intValue());
    }
    public static void main(String[] args) {
        var character = new Avatar();
        character.move(10.0, 10.0);
        character.move(10, 10);
    }
}
