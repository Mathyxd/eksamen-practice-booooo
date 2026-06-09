package eksamen22;

import java.util.ArrayList;

public class Pizza {
    private Size size;
    private ArrayList<String> toppings;

    public Pizza(Size size, ArrayList<String> toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    public Size getSize() {
        return size;
    }

    public ArrayList<String> GetToppings() {
        return toppings;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public int calculatePrice() {
        if(size == Size.LARGE) {
            return  120 + (toppings.size() * 10);
        } else if (size == Size.MEDIUM) {
            return 80 + (toppings.size() * 10);
        } else {
            return 50 + (toppings.size() * 10);
        }

    }

    @Override
    public String toString() {
        return size + " - " + toppings;
    }
}
