package eksamen34;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();

        Vegetable v1 = new Vegetable("grøn",25,"spring");
        Vegetable v2 = new Vegetable("grøn2",253,"sommer");
        Fastfood f1 = new Fastfood("mcdonalds",24,500);
        Fastfood f2 = new Fastfood("mcdonalds2",26,500);

        foods.add(v1);
        foods.add(v2);
        foods.add(f1);
        foods.add(f2);

        Food.saveToFile(foods);
        System.out.println("det er gemt");
    }
}
