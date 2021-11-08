package com.pizza.topping;

import com.pizza.Pizza;
import com.pizza.PizzaDecorator;

public class BeefTopping extends PizzaDecorator {

    public BeefTopping(Pizza p) {
        super(p);
        //TODO Auto-generated constructor stub
    }
    
    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" with Beef");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + 400;
    }


}
