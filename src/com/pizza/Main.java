package com.pizza;

import com.pizza.topping.CheeseTopping;
import com.pizza.topping.BeefTopping;
import com.pizza.topping.ChickenTopping;
import com.pizza.topping.OnionTopping;
import com.pizza.topping.PienapleTopping;
import com.pizza.topping.TomatoesTopping;
import com.pizza.kind.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(" 🍕PIZZA and TOPPING PRICE 🍕");
        System.out.println("-----------------");
        System.out.println("📗 Neapolitan : 6000");
        System.out.println("📘 Sicilian : 5500");
        System.out.println("📙 Chicago : 5000");
        System.out.println("🧀 Cheese : 200");
        System.out.println("🍅 Tomato :  100");
        System.out.println("🍍 Pineaple : 150");
        System.out.println("🧄 Onion : 100");
        System.out.println("🥩 Beef : 400");
        System.out.println("🍗 Chicken : 300");
        System.out.println("-----------------");


        Pizza pizzaChicagoKeju = new CheeseTopping(new ChicagoPizza());
        pizzaChicagoKeju.namaPizza();
        System.out.println("\nHarga : " + pizzaChicagoKeju.hargaPizza());
        System.out.println("---------");

        Pizza pizzaSicilianKejuBeefOnionTomato = new CheeseTopping(new BeefTopping(new OnionTopping(new TomatoesTopping(new SicilianPizza()))));
        pizzaSicilianKejuBeefOnionTomato.namaPizza();
        System.out.println("\nHarga : " + pizzaSicilianKejuBeefOnionTomato.hargaPizza());
        System.out.println("---------");

        Pizza pizzaNeapolitanChickenPineapple = new ChickenTopping(new PienapleTopping(new NeapolitanPizza()));
        pizzaNeapolitanChickenPineapple.namaPizza();
        System.out.println("\nHarga : " + pizzaNeapolitanChickenPineapple.hargaPizza());
        System.out.println("---------");


    }
    
}
