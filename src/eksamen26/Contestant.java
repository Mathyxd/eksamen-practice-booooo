package eksamen26;

import java.util.ArrayList;

public class Contestant {
    private String name;
    private int burgersEaten;

    public Contestant(String name, int burgersEaten) {
        this.name = name;
        this.burgersEaten = burgersEaten;
    }

    public String getName() {
        return name;
    }

    public int getBurgersEaten() {
        return burgersEaten;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBurgersEaten(int burgersEaten) {
        this.burgersEaten = burgersEaten;
    }

    public void eatBurger(int amount) {
        burgersEaten = burgersEaten + amount;
    }

    public static Contestant findChampion(ArrayList<Contestant> contestants) {
        Contestant mostBurgersEaten = contestants.get(0);
        for (Contestant c : contestants) {
            if (c.getBurgersEaten() > mostBurgersEaten.getBurgersEaten()) {
                mostBurgersEaten = c;
            }
        }
        return mostBurgersEaten;
    }

    @Override
    public String toString(){
        return name + " - " + burgersEaten;
    }
}
