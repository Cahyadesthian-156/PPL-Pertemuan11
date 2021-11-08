package com.animalPattern;

public class AnimalCreation {

    private Animal chicken = new Chicken();
    private Animal sheep = new Sheep();
    
    public AnimalCreation() {
        chicken.setName("Ayam");
        sheep.setName("Domba");
    }

    public Animal retrieveAnimal(String kindOfAnimal) {
        if("Chicken".equals(kindOfAnimal)) {
            return (Animal) chicken.clone();
        }
        if("Sheep".equals(kindOfAnimal)) {
            return (Animal) sheep.clone();
        }
        return null;
    }


}
