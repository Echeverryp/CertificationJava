package secondTime.polimorfismo.models;

public class Mascota {

    private String nombre;
    private int edad;
    private double peso;
    private String raza;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        System.out.println("Soy el padre");
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String saludoAnimal(){
        return this.nombre + " Te saluda ";
    }
}
