package com.java.certification.en;

public enum Continente {
    EUROPA(91,42.0),
    AMERICA(73,33.0),
    ASIA(52,31.0),
    OCEANIA(40,22.0),
    ANTARTIDA(10,15.0);

    private int cantHabitantes;
    private double superficie;

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    private Continente(int cantHabitantes, double superficie) {
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }

    public double densidad(){
        return this.cantHabitantes/this.superficie;
    }

    public static void main(String[] args) {


        Continente continente=Continente.EUROPA;
        continente.getCantHabitantes();
        Continente.valueOf("EUROPA");
    }
}
