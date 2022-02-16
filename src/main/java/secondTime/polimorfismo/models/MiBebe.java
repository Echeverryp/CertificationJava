package secondTime.polimorfismo.models;

public class MiBebe extends Dog{

    public void saludoAnimal(String nombre){
        System.out.println(nombre);
    }

    public String saludoAnimal(){
        return getNombre() + " Te saluda ";
    }
}
