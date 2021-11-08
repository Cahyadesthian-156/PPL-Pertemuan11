package com.pizza.topping;

import com.pizza.Pizza;
import com.pizza.PizzaDecorator;

public class OnionTopping extends PizzaDecorator {

	public OnionTopping(Pizza p) {
		super(p);
		//TODO Auto-generated constructor stub
	}

    @Override 
    public void namaPizza() {
        super.namaPizza();
        System.out.print(" with Onion");
        
    } 

    @Override
    public int hargaPizza() {
        return super.hargaPizza() + 100;
    }
    
}
