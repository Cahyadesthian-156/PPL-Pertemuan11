package com.pizza.kind;

import com.pizza.Pizza;

public class ChicagoPizza implements Pizza {

    @Override
    public void namaPizza() {
        System.out.println("📙 Chicago Pizza");
        
    }

    // private int price = 5000;

    // public int getPrice() {
    //     return price;
    // }

    @Override
    public int hargaPizza() {
        // TODO Auto-generated method stub
        return 5000;
    }

    

    
}
