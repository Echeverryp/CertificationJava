package com.java.certification.questions.Lambdas.Ejercicio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer id;
    private String name;
    private LocalDate birthDate;

}
