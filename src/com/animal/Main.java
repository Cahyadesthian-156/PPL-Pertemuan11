package com.animal;
public class Main {
     public static void main(String[] args) {
        Chicken chicken1 = new Chicken("Chicken", "Ciki");
        chicken1.greetAnimal();
        Chicken chicken2 = new Chicken("Chicken", "Cik cik");
        chicken2.greetAnimal();        
        Chicken chicken3 = new Chicken("Chicken", "Cak cik");
        chicken3.greetAnimal();        
        Chicken chicken4 = new Chicken("Chicken", "Caka");
        chicken4.greetAnimal();        
        Chicken chicken5 = new Chicken("Chicken", "Cuku");
        chicken5.greetAnimal();        
        Chicken chicken6 = new Chicken("Chicken", "Ciku");
        chicken6.greetAnimal();

        System.out.println("\n-------------------------------------------------");
        System.out.println("Animal on the farm now is " + Animal.animalCreated + "\n");

        Sheep sheep1 = new Sheep("Sheep", "Moo");
        sheep1.greetAnimal();
        Sheep sheep2 = new Sheep("Sheep", "MoMo");
        sheep2.greetAnimal();
        Sheep sheep3 = new Sheep("Sheep", "Mumu");
        sheep3.greetAnimal();
        Sheep sheep4 = new Sheep("Sheep", "Muu");
        sheep4.greetAnimal();

        System.out.println("\n-------------------------------------------------");
        System.out.println("Animal on the farm now is " + Animal.animalCreated + "\n");

    }
}
