package com.animal;

public class Animal {
    
    int numberOfLegs;
    String jenis;
    static int animalCreated;

    Animal(String jenis) {
        this.jenis = jenis;
        Animal.animalCreated ++;
    }

    void greetAnimal() {
        System.out.println("Hi, I am a " + this.jenis);
    }



}
