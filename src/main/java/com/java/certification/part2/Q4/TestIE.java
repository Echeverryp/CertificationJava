package com.java.certification.part2.Q4;

public class TestIE extends testAbstract implements TestInterface{


    @Override
    public void testNoAbstract() {

    }

    public static void main(String[] args) {
        TestIE testIE=new TestIE();
        Integer intT=TestIE.testIn;
    }
}
