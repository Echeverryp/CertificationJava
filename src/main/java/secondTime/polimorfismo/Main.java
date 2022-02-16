package secondTime.polimorfismo;

import secondTime.polimorfismo.models.Dog;
import secondTime.polimorfismo.models.Mascota;
import secondTime.polimorfismo.models.MiBebe;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Mascota dogMascota=new Dog();
        dog.saludoAnimal();
        System.out.println( Dog.edad2);
        System.out.println( Dog.edad3);
        MiBebe miBebe=new MiBebe();
        miBebe.setNombre("bucky");
        System.out.println(miBebe.saludoAnimal());

    }
}
