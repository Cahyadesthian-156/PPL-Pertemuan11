package com.animalPattern;

public class Sheep extends Animal {

    private int numberOfClones = 0;

    @Override
    public String greetinAnimal() {
        StringBuffer sheepTalk = new StringBuffer();
        sheepTalk.append("Hello🐑, Mbeek, I am a ");
        sheepTalk.append(nama);
        return sheepTalk.toString();
    }

    public Sheep clone() {
        Sheep clonedSheep = (Sheep) super.clone();
        String sheepName = clonedSheep.getName();
        numberOfClones++;
        clonedSheep.setName(sheepName+numberOfClones);
        return clonedSheep;
    }
    
}
