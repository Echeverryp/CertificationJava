package com.java.certification.programacionFuncional.interfaesJDK;

import com.java.certification.questions.Q37.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class MatchSample {

    private static final String regexLetter= "[a-zA-Z]{1,}";
    public static void main(String[] args) {
        List<Pet> lst= Arrays.asList(new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4),new Pet("Bambie",14),new Pet("Tony",12)
                , new Pet("Bruno" , 8), new Pet("Bucky",4));

        var patterns= Pattern.compile(regexLetter);
        Predicate<Pet> petNameContains= pet->patterns.matcher(pet.getName()).find();

        Predicate<Pet> petAge= pet->pet.getAge()>0;

        var concidencias= lst.stream().peek(p-> System.out.println("Nombre : " + p.getName()
                + "Edad" + p.getAge())).allMatch(pet->petNameContains.and(petAge).test(pet));

        var concidenciasNoneMatch= lst.stream().peek(p-> System.out.println("Nombre : " + p.getName()
                + "Edad" + p.getAge())).noneMatch(pet->petNameContains.and(petAge).test(pet));

        var concidenciasAnyMatch= lst.stream().peek(p-> System.out.println("Nombre : " + p.getName()
                + "Edad" + p.getAge())).anyMatch(pet->petNameContains.and(petAge).test(pet));

        var message = concidencias?"Se ha encontrado" : "No se ha encontrado";
        System.out.println(message);

        ArrayList<List<Pet>> newPetArrayList=new ArrayList<>();
        newPetArrayList.stream().
                filter(lista->lista.stream().allMatch(MatchSample::multipleContionals)).
                forEach(lista->{
                    System.out.println("__________________________");
                    lista.stream().filter(p->p.getAge()>10).forEach(System.out::println);
                });


    }

    private static boolean multipleContionals(Pet pet){
        Predicate<Pet> predicate=(p)->p.getAge()>10;
        Predicate<Pet> predicate1 = (p)->p.getName().contains("T");
        return predicate.and(predicate1).test(pet);
    }
}
