package thirdTime.FunctionalInterfaces.Suplier;

import com.java.certification.Suppliers.HotDog;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<HotDog> hotodg=HotDog::new;
        Supplier<LocalDate> date= ()->LocalDate.now();
        var random = new Random();
        Supplier<Integer> randomInt=()->random.nextInt();
        usingSupplier(date);
        usingSupplier(randomInt);
        usingSupplier(hotodg);


    }

    static <T> void usingSupplier(Supplier<T> supplier){
        System.out.println("Hacemos cierto codigo");
        System.out.println("Se obtiene: "+supplier.get());

    }
}
