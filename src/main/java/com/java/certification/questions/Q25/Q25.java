package com.java.certification.questions.Q25;

public abstract class Q25 {

    public abstract void checkValue() throws IllegalArgumentException;

    public boolean isValueNumber(Object val){

        if(val instanceof Number){
            return true;

        }
        else{
            try {
                Double.parseDouble(val.toString());
                return true;
            }catch (NumberFormatException e){
                return false;
            }
        }

    }
}
