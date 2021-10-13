package com.java.certification.questions.Q18;

public interface TestInterface {

    default void samplingProbProcedure(){
        probeProcedure();
        System.out.println("Collect Sample");
        System.out.println("Leave Asteroid");
        System.out.println("Deck with main Craft");
    }

    default void  explosionProbeProcedure(){
        probeProcedure();
        System.out.println("Explode");
    }


    private void probeProcedure(){
        System.out.println("Launch Probe");
        System.out.println("Land on Asteroid");
    }
}
