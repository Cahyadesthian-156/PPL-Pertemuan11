package com.animalPattern;

public abstract class Animal implements Cloneable {

    protected int banyakKaki = 0;
    protected String deskripsi = "";
    protected String nama = "";

    public abstract String greetinAnimal();

    public Animal clone() {
        Animal clonedAnimal = null;
        try {
            clonedAnimal = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        clonedAnimal.setName(nama);
        return clonedAnimal;
    }

    public void setName(String nama2) {
        this.nama = nama2; 
    }

    public String getName() {
        return nama;
    }


    
}
