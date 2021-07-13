package com.java.certification.questions.Q0;

public class Final {
    public final String VARIABLE_PUBLIC="HOLAMUNDOPUBLIC";
    private final String VARIABLE_PRIVATE="HOLAMUNDOPRIVATE";
    protected final String VARIABLE_PROTECTED="HOLAMUNDOPROTECTED";
    final static String VARIABLE_STATIC_FINAL="HOLAMUNDOFINALSTATIC";

    public String getVARIABLE_PUBLIC() {
        return VARIABLE_PUBLIC;
    }

    public String getVARIABLE_PRIVATE() {
        return VARIABLE_PRIVATE;
    }

    public String getVARIABLE_PROTECTED() {
        return VARIABLE_PROTECTED;
    }

    public static String getVariableStaticFinal() {
        return VARIABLE_STATIC_FINAL;
    }

    public static void main(String[] args) {
        Final finalClass=new Final();
        System.out.println(finalClass.VARIABLE_PRIVATE);
        System.out.println(finalClass.VARIABLE_PROTECTED);
        System.out.println(finalClass.VARIABLE_PUBLIC);
        System.out.println(Final.VARIABLE_STATIC_FINAL);



    }


}
