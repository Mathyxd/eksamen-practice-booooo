package eksamen14;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<String> ingredients;

    public Recipe(String name, ArrayList<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
    public String getName() {
        return name;
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipeAsText() {
        String text = "Opskrift" + name + "\nIngredienser:\n";
        for (String ingredient : ingredients) {
            text = text + "- " + ingredient + "\n";
        }
        return text;
    }

    public boolean containsIngredient(String ingredient) {
        for (String i : ingredients) {
            if(i.equals(ingredient)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return name + " - " + ingredients;
    }
}
