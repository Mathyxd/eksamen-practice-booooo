package eksamen1;

import java.util.ArrayList;

public abstract class Athlete {
    private String name;
    private boolean isActive;
    public ArrayList<Integer> points = new ArrayList<>();

    public Athlete (String name, boolean isActive, ArrayList points) {
        this.name = name;
        this.isActive = isActive;
        this.points = points;
    }

    public String getName() {
        return name;
    }
    public boolean isActive() {
        return isActive;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }
    public void setName(String name) {
        this.name = name;
    }

}
