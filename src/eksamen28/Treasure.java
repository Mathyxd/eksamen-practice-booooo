package eksamen28;

import java.util.ArrayList;

public class Treasure {
    private String name;
    private int  goldValue;
    private String location;

    public Treasure(String name, int goldValue, String location) {
        this.name = name;
        this.goldValue = goldValue;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void increaseValue(int amount) {
        goldValue = goldValue + amount;
    }

    public static Treasure findBiggestTreasure(ArrayList<Treasure> treasures) {
        Treasure highestValue = treasures.get(0);
        for (Treasure t : treasures) {
            if (t.getGoldValue() > highestValue.getGoldValue()) {
                highestValue = t;
            }
        }
        return highestValue;
    }

    @Override
    public String toString(){
        return name + " - " + goldValue + " - " + location;
    }

}
