package com.java.certification.questions.Q0;

enum Talla {

    MINI("S","PRUEBA");

    private Talla(String talla,String prueba){
    this.talla=talla;
    this.prueba=prueba;
    }
    private String prueba;
    private String talla;

    public String getPrueba() {
        return prueba;
    }

    public String getTalla() {
        return talla;
    }

}
