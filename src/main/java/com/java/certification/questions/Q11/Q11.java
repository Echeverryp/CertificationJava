package com.java.certification.questions.Q11;


public class Q11 {

    public static void doThings() throws GeneralException{

        try{
            throw new RuntimeException("Something Happpened");
        }
        catch (Exception e){
            throw new SpecificException("");

        }

    }

    public static void main(String[] args) {
        try {
            Q11.doThings();

        }catch (Exception e){
        System.out.println(e.getMessage());
        }
    }

   public static class GeneralException extends Exception{
        public GeneralException(String s){
            super(s);
        }
    }

    public static class SpecificException extends GeneralException{
        public SpecificException(String s){
            super(s);
        }
    }
}


