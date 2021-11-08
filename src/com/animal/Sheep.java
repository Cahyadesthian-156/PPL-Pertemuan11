package com.animal;

public class Sheep extends Animal {

    String animalKind = "Sheep";
    String sheepName;
    static int sheepCreated;

    Sheep(String animalKind, String sheepName) {
        super(animalKind);
        super.numberOfLegs = 4;
        this.sheepName = sheepName;
        Sheep.sheepCreated++;
    }

    @Override
    void greetAnimal() {
        System.out.println("\nNew Sheep Jumped in 🐑");
        System.out.println("Hi, I am a " + this.animalKind + Sheep.sheepCreated + " , My name is " + this.sheepName + ", I have " + super.numberOfLegs + " legs");
    }
    
}
