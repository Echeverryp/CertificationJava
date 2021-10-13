package com.java.certification.part2.Q4;

public abstract class testAbstract {
    public String textoPublic;
    private String textoPrivate;
    protected String textoProtected;


    public static String textoPublicStatic;
    private static String textoPrivateStatic;
    protected static String textoProtectedStatic;


    public static final String textoPublicStaticFinal="";
    private static final String textoPrivateStaticFinal="";
    protected static final String textoProtectedStaticFinal="";


    public void testAbstract(){
        System.out.println("IM A ABSTRACT CLASS");
    };

    //se puede protected y public .. private no se puede
    protected abstract void testNoAbstract();

    public String getTextoPublic() {
        return textoPublic;
    }

    public void setTextoPublic(String textoPublic) {
        this.textoPublic = textoPublic;
    }

    public String getTextoPrivate() {
        return textoPrivate;
    }

    public void setTextoPrivate(String textoPrivate) {
        this.textoPrivate = textoPrivate;
    }

    public String getTextoProtected() {
        return textoProtected;
    }

    public void setTextoProtected(String textoProtected) {
        this.textoProtected = textoProtected;
    }

    public static String getTextoPublicStatic() {
        return textoPublicStatic;
    }

    public static void setTextoPublicStatic(String textoPublicStatic) {
        testAbstract.textoPublicStatic = textoPublicStatic;
    }

    public static String getTextoPrivateStatic() {
        return textoPrivateStatic;
    }

    public static void setTextoPrivateStatic(String textoPrivateStatic) {
        testAbstract.textoPrivateStatic = textoPrivateStatic;
    }

    public static String getTextoProtectedStatic() {
        return textoProtectedStatic;
    }

    public static void setTextoProtectedStatic(String textoProtectedStatic) {
        testAbstract.textoProtectedStatic = textoProtectedStatic;
    }

    public static String getTextoPublicStaticFinal() {
        return textoPublicStaticFinal;
    }

    public static String getTextoPrivateStaticFinal() {
        return textoPrivateStaticFinal;
    }

    public static String getTextoProtectedStaticFinal() {
        return textoProtectedStaticFinal;
    }
}
