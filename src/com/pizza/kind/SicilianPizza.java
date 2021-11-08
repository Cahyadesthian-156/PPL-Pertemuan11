package com.pizza.kind;

import com.pizza.Pizza;

public class SicilianPizza implements Pizza {

    @Override
    public void namaPizza() {
        System.out.println("📘 Sicilian Pizza");
        
    }

    // private int price = 5500;

    // public int getPrice() {
    //     return price;
    // }

    @Override
    public int hargaPizza() {
        // TODO Auto-generated method stub
        return 5500;
    }
    
}
