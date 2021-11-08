package com.animalPattern;

public class Chicken extends Animal {

    private int numberOfClones = 0;

    @Override
    public String greetinAnimal() {
        StringBuffer chichkenTalk = new StringBuffer();
        chichkenTalk.append("🐣Hi, chick chick, I am a ");
        chichkenTalk.append(nama);
        return chichkenTalk.toString();
    }

    public Chicken clone() {
        Chicken clonedChicken = (Chicken) super.clone();
        String chickenName = clonedChicken.getName();
        numberOfClones++;
        clonedChicken.setName(chickenName+numberOfClones);
        return clonedChicken;
    }

    
    
}
