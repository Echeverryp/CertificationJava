package com.java.certification.en;

public class Uso_Tallas {

    enum Talla{

        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");

        private Talla(String abre){
            this.abre=abre;

        }

        public String getAbre() {
            return abre;
        }

        public void setAbre(String abre) {
            this.abre = abre;
        }

        public  String abre;
    }

    public static void main(String[] args) {
        Talla s =Talla.MINI;
        Talla m =Talla.MEDIANO;

        Talla l =Talla.GRANDE;

        Talla xl =Talla.MUY_GRANDE;

        System.out.println(s.toString());

        //TRAE TODOS LOS ENUM
        Talla[] tallas=Talla.values();

        Talla talla=Enum.valueOf(Talla.class,"MINI");

        //POSICION DONDE ESTA EL ENUM
        System.out.println(s.ordinal());
        System.out.println(m.ordinal());
        System.out.println(l.ordinal());
        System.out.println(xl.ordinal());

        //NOMBRE DE LA VARIABLO (NAME Y TO STRING ESLO MISMIO)
        System.out.println(s.name());
        System.out.println(m.name());
        System.out.println(l.toString());
        System.out.println(xl.toString());

        Talla vof= Talla.valueOf("MINI");
        Talla vofN= Talla.valueOf("");
    }
}
