package com.java.certification.programacionFuncional.interfaesJDK;

public class Sub {

    private final String name="Subscriptor";
    private final Integer age;

    public Sub(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Sub{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
