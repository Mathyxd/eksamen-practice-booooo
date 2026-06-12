package eksamen34;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Food {
    private String name;
    private int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void saveToFile(ArrayList<Food> foods) {
        try {
            FileWriter writer = new FileWriter("foodInfo.txt");
            for (Food f : foods) {
                writer.write(f + "\n");

            }
            writer.close();
        } catch (IOException e) {
            System.out.println("fejl");
        }
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
