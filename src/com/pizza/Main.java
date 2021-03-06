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

        System.out.println(" ðPIZZA and TOPPING PRICE ð");
        System.out.println("-----------------");
        System.out.println("ð Neapolitan : 6000");
        System.out.println("ð Sicilian : 5500");
        System.out.println("ð Chicago : 5000");
        System.out.println("ð§ Cheese : 200");
        System.out.println("ð Tomato :  100");
        System.out.println("ð Pineaple : 150");
        System.out.println("ð§ Onion : 100");
        System.out.println("ð¥© Beef : 400");
        System.out.println("ð Chicken : 300");
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
