package com.java.certification.questions.Q45;

import java.util.Iterator;
import java.util.List;

public class Test {

    class L extends Exception{}
    class M extends L{}
    class N extends RuntimeException{}

    public void p() throws L{ throw new M();}
    public void q() throws N{ throw new N();}

    public static void main(String[] args) {
        try {
        Test test=new Test();
        test.p();

            test.p();
        } catch (L l) {
            l.printStackTrace();
        }




       for(Iterator loop=List.of(1,2,3).iterator();loop.hasNext();){{
       }
       }
    }
}
