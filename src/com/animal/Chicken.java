package com.animal;

public class Chicken extends Animal{


    String animalKind = "Chicken";
    String chickenName;
    static int chickenCreated ;

    Chicken(String animalKindString, String chickenName ) {
        super(animalKindString);
        super.numberOfLegs = 2;
        this.chickenName = chickenName;
        Chicken.chickenCreated++;
    }

    

    @Override
    void greetAnimal() {
        System.out.println("\nNew Chicken Arrived🐣");
        System.out.println("Hello, I am a " + this.animalKind + Chicken.chickenCreated + " , My name is " + this.chickenName + ", I have " + numberOfLegs + " legs");
    }

    
}
