package com.java.certification.questions.Lambdas.Ejercicio.main;

import com.java.certification.questions.Lambdas.Ejercicio.models.Person;
import com.java.certification.questions.Lambdas.Ejercicio.models.Product;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Person p1=new Person(1,"Mito", LocalDate.of(1991,1,21));
        Person p2=new Person(1,"Code", LocalDate.of(1990,2,21));
        Person p3=new Person(1,"Jaime", LocalDate.of(1990,5,23));
        Person p4=new Person(1,"Dukes", LocalDate.of(2019,6,15));
        Person p5=new Person(1,"James", LocalDate.of(2010,1,4));

        Product pr1=new Product(1,"Ceviche",15.0);
        Product pr2=new Product(1,"Chilaquiles",25.50);
        Product pr3=new Product(1,"Bandeja Paisa",35.50);
        Product pr4=new Product(1,"Ceviche",15.0);

        List<Person> persons= Arrays.asList(p1,p2,p3,p4,p5);
        List<Product> products= Arrays.asList(pr1,pr2,pr3,pr4);

        //**FOR EACH**//
        //programacion .. resolver problemas pero con uso de funciones
        //lambda
        persons.forEach(person -> System.out.println(person));

        //Parametro de la izquierda  y el de la derecha sean el mismo , se puede usar metodos a referencia
        persons.forEach(System.out::println);
        //otro ejemplo seria asi
        //Por ejemplo voy a llamar un metodo servicio.add que agrega algo en la base de datos y el valor de la izquierda es x
        //y el de la derecha tambien , entonces se podria simplificar asi
        //persons.forEach(x->service.add(x)); SIN SIMPLIFICAR
        //persons.forEach(service::add); SIMPLIFICADO


        //**FILTER**//
        //El filter necesita como parametro un predicate y un predicate es una expresion que retorna una expresion booleana
        //En cambio la funcion (map) no espera retornar un true o un false , sino un valor
        //stream metodo que permite trabajar de una forma muy amena con las collecciones
        //El parallelStream hace lo mismo pero es un poco mas eficiente, trabaja con hilos
       // List<Person> filterList1=persons.parallelStream().filter(p-> getAge(p.getBirthDate())>=18).collect(Collectors.toList());
        List<Person> filterList1=persons.stream().filter(p-> getAge(p.getBirthDate())>=18).collect(Collectors.toList());
        printLits(filterList1);


        //**MAP**//
        //Transforma el tipo de dato, en este caso devolvemos un integer que es la edad
        List<Integer> filterList2=persons.
                stream().
                filter(p-> getAge(p.getBirthDate())>=18)
                //En este caso devuelve una lista de integers , porque esta devolviendo la edad

                .map(p->App.getAge(p.getBirthDate())).
                        collect(Collectors.toList());

        persons.stream().map(p->p.getName()).collect(Collectors.toCollection(TreeSet::new)).stream().anyMatch(p->p.startsWith("a"));


        //STRING PARAMETRO DE ENTRADA Y STRING PARAMETRO DE SALIDA
        //Funcion que hace la concatenacion
        Function<String , String > codeFunction= name-> "Coder" + name;

        List<String> filterList2Strings=persons.
                stream()
                //En este caso devuelve una lista de strings por que etamos concatenando coder con el nombre de los usuarios
                //.map(p->"Coder" + p.getName()).
                //ESTO SE HACE PARA TRABAJAR CON UNA CADENA DE TEXTO Y EL FUNCTION QUE SIGA PUEDA RECONOCERLO COMO UN STRING
                //.map(p->p.getName())
                .map(Person::getName)
                .map(codeFunction).
                    collect(Collectors.toList());

        //**SORTED**//
        Comparator<Person> byAscName= (Person o1, Person o2)->o1.getName().compareTo(o2.getName());
        Comparator<Person> byAscNameDesc= (Person o1, Person o2)->o2.getName().compareTo(o1.getName());
        Comparator<Person> byBirthDay= (Person o1, Person o2)->o2.getBirthDate().compareTo(o1.getBirthDate());
        List<Person> filterList3=persons.stream()
                .sorted(byAscName)
                .collect(Collectors.toList());

        printLits(filterList3);

        //**MATCH**//

        Predicate<Person> personPredicate=person -> person.getName().startsWith("J");
        //EL ANY MATCH DEVUELVE UN TRUE O UN FALSE SI ALGUNO DE LOS ELEMENTOS CUMPLE CON EL CRITERIO QUE SE ESPECIFIQUE
        //NO EVALUA TODO EL STREAM ,SINO QUE EN EL MOMENTO QUE ENCUENTRE UNO, AHI TERMINA
        boolean rpt1= persons.stream().anyMatch(personPredicate);

        //ALL MATCH DEVUELVE UN TRUE O UN FALSE SI TODOSSSS EN EL STREAM CUMPLE LA CONDICION

        boolean rpt2= persons.stream().allMatch(personPredicate);


        //NONEMATCH DEVUELVE UN TRUE O UN FALSE SI NINGUNO EN EL STREAM CUMPLE LA CONDICION
        boolean rpt3= persons.stream().noneMatch(personPredicate);


        //**LIMIT/SKYP**//
        //HACE ALGO COMO UN PAGINADOR
        int pageNumber=0;
        int pageSize=2;
        List<Person> filterList4Strings=persons.stream()
                //COMIENZA A LEER DESDE LA PSOCION DOS
                //SI SE PONE 0 , SIGNIFICA QUE NO VA A OMITIR NADA DE LA COLLECION
                .skip(pageNumber*pageSize)
                //COGE NADA MAS LOS DOS PRIMEROS
                .limit(pageSize)
                .collect(Collectors.toList());

        //COLLECTORS
        //Los ordena en un map , el double seria el price q esta en el group by {35.5=[Product(id=1, name=Bandeja Paisa, price=35.5)], 25.5=[Product(id=1, name=Chilaquiles, price=25.5)]}
        Map<Double, List<Product>> collect1=
                products.stream().filter(p->p.getPrice()>20).collect(Collectors.groupingBy(Product::getPrice));
        System.out.println("COLLECT 1" + collect1);


        //Counting
        //Nos cuenta cuantos elementos repetidos hay dependiendo de lo q le pasemos .. en este caso por get name {Ceviche=2, Bandeja Paisa=1, Chilaquiles=1}
        Map<String ,Long> collect2=products
                .stream().collect(Collectors.groupingBy(
                Product::getName,Collectors.counting()
        ));

        System.out.println("COLLECT 2" + collect2);

        //Agrupando por nombre producto y Sumando
        //COLLECT 3{Ceviche=30.0, Bandeja Paisa=35.5, Chilaquiles=25.5} //SUMA LOS QUE TENGA EL NOMBRE REPETIDO
        Map<String ,Double> collect3= products
                .stream()
                .collect(Collectors.groupingBy(Product::getName,Collectors.summingDouble(Product::getPrice)));

        System.out.println("COLLECT 3" + collect3);
        //Obtiene suma y resumen
        DoubleSummaryStatistics statistics =products.stream().collect(Collectors.summarizingDouble(Product::getPrice));
        System.out.println(statistics.getMax());
        System.out.println( statistics.getSum());
        System.out.println(statistics.getMin());

        //7-reduce Devulve un optional y hace la suma de todos los precios
        Optional<Double> sum=products.stream().map(p->p.getPrice()).reduce(Double::max);
        System.out.println(sum.get());
    }

    public static int  getAge(LocalDate birthDate){
        return Period.between(birthDate,LocalDate.now()).getYears();
    }
    public static void printLits(List<?> list){
        list.forEach(System.out::println);
    }
}
