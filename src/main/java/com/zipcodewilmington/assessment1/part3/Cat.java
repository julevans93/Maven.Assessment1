package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    private String name;
    private int age;

    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.petName = name;
        this.petAge = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.petAge = age;
        this.petName = "Cat name";
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.petName = name;
        this.petAge = age;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.petName = "Cat name";
        this.petAge = age;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
