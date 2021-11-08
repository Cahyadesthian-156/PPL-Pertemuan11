package com.pizza.topping;

import com.pizza.Pizza;
import com.pizza.PizzaDecorator;

public class TomatoesTopping extends PizzaDecorator {

    public TomatoesTopping(Pizza p) {
        super(p);
        //TODO Auto-generated constructor stub
    }
    
    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" with tomat");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + 100;
    }
    
}
