package eksamen34;

public class Fastfood extends Food{
    public int calories;

    public Fastfood(String name, int price, int calories) {
        super(name,price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + calories;
    }
}
