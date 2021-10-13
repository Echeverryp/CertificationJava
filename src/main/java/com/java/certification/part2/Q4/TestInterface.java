package com.java.certification.part2.Q4;

public interface TestInterface {
    public Integer testIn=2;
    //no se permite
    // private Integer testInP=2;

    //no se permite
   // protected Integer testIn=2;



    static Integer testIn2=2;
    final Integer testIn2F=2;

    public abstract void testAbstract();

    public void testNoAbstract();

    public default void testDefault(){

    }

    static void test(){

    };
    private void testP(){

    }
    //NO PERMITIDO
    /*public void testPu(){

    }¨*/


}
