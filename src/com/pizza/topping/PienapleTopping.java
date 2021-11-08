package com.pizza.topping;

import com.pizza.Pizza;
import com.pizza.PizzaDecorator;

public class PienapleTopping extends PizzaDecorator {

    public PienapleTopping(Pizza p) {
        super(p);
        //TODO Auto-generated constructor stub
    }
    
    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" with Pinapple");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + 150;
    }

}
