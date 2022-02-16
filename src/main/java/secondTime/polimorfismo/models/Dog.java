package secondTime.polimorfismo.models;

public class Dog extends Mascota{
    private int edad;
    private static int edad1;
    public static int edad2;
    public static final String edad3="3";

    private static final String edad4="4";

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getEdad1() {
        return edad1;
    }

    public static void setEdad1(int edad1) {
        Dog.edad1 = edad1;
    }

    public static int getEdad2() {
        return edad2;
    }

    public static void setEdad2(int edad2) {
        Dog.edad2 = edad2;
    }

    public static String getEdad3() {
        return edad3;
    }

    public static String getEdad4() {
        return edad4;
    }
}
