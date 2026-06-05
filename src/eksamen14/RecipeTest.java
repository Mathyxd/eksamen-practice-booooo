package eksamen14;

import java.util.ArrayList;

public class RecipeTest {
    public static void main(String[] args) {
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("mel");
        ingredients.add("æg");
        ingredients.add("mælk");


        Recipe pandekager = new Recipe("pandekager", ingredients);


        System.out.println(pandekager);
        System.out.println(pandekager.getRecipeAsText());
        System.out.println(pandekager.containsIngredient("mel"));



        ArrayList<String> ingredients2 = new ArrayList<>();
        ingredients2.add("tomato");
        ingredients2.add("ost");
        ingredients2.add("dej");

        Recipe pizza = new Recipe("margerita", ingredients2);

        System.out.println(pizza.getRecipeAsText());
        System.out.println(pizza.containsIngredient("mælk"));
    }
}
