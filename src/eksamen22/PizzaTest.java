package eksamen22;

import java.util.ArrayList;

public class PizzaTest {
    public static void main(String[] args) {
        ArrayList<String> toppings = new ArrayList<>();

        toppings.add("tomato");
        toppings.add("ost");
        toppings.add("pepperoni");

        Pizza Pepperoni = new Pizza(Size.LARGE, toppings);

        ArrayList<String> t1 = new ArrayList<>();
        t1.add("ost");
        t1.add("tomat");
        t1.add("skinke");
        Pizza Skinke = new Pizza(Size.MEDIUM, t1);

        ArrayList<String> t2 = new ArrayList<>();
        t2.add("ost");
        t2.add("skinke");
        t2.add("ananas");
        Pizza Hawaii = new Pizza(Size.SMALL, t2);

        System.out.println("Pepperoni pizza: " + Pepperoni);

        System.out.println("Samlet pris: " + Pepperoni.calculatePrice());


        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(Hawaii);
        pizzas.add(Pepperoni);
        pizzas.add(Skinke);

        Pizza highestPrice = Hawaii;
        for (Pizza p : pizzas) {
            if (p.calculatePrice() >  highestPrice.calculatePrice()) {
                highestPrice = p;
            }
        }
        System.out.println("dyreste pizza: " + highestPrice + " - " + highestPrice.calculatePrice());
    }
}
