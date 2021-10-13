package com.java.certification.herencia;

public class ObjectoExtended extends Objeto{


    private int ancho;

    @Override
    public int getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public static void main(String[] args) {

        ObjectoExtended oe=new ObjectoExtended();
        System.out.println(oe.ancho);
        System.out.println(oe.getAncho());

    }
}
