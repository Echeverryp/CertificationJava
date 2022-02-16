package thirdTime.FunctionalInterfaces.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class ConsumerBiConsumerExample {


    static List<Object> lst=new ArrayList<>();

    public static void main(String[] args) {
        lst.add("Hola mundo");
        lst.add(200);
        lst.add(true);
        lst.add(48.8f);

        usingExampleConsumer("Hola soy un valor de tipo T" , System.out::println,
                lst::add, ConsumerBiConsumerExample::printLst);
        usingBiConsumer("Hello First Value", "Second Value",
                (t,u)->{ System.out.println(t+" "+u);},
                (t,u)->{ System.out.println("THIS IS THE SECOND " + t + u);},
                (t,u)->{ System.out.println("THIS IS THE THIRD ONE " + t+" "+u);});
    }

    static <T,U>void usingBiConsumer(T oneValue, U otherValue, BiConsumer<T,U> biConsumer,
                                     BiConsumer<T,U> biConsumer2,
                                     BiConsumer<T,U> biConsumer3){
        biConsumer.accept(oneValue,otherValue);
        biConsumer.andThen(biConsumer2).andThen(biConsumer3).accept(oneValue,otherValue);
    }

    static <T> void printLst(T value){
        System.out.println("Se añadio a la lista el valor: " + value + " -- Total de valores en la lista:" +
                "");
        lst.forEach(System.out::println);
    }

     static  <T> void usingExampleConsumer (T value, Consumer<T> consumer,
                                     Consumer<T> consumer2,
                                     Consumer<T> consumer3)
    {
        consumer.accept(value);
        consumer2.accept(value);
        consumer3.accept(value);
        var consumerComplete= consumer.andThen(consumer2).andThen(consumer3);
        consumerComplete.accept(value );


    }



}
