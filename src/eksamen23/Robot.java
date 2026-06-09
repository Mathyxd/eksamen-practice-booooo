package eksamen23;

import java.util.ArrayList;

public class Robot {
    private String name;
    private int powerlevel;
    private int speed;

    public Robot(String name, int powerlevel, int speed) {
        this.name = name;
        this.powerlevel = powerlevel;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getPowerlevel() {
        return powerlevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerlevel(int powerlevel) {
        this.powerlevel = powerlevel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void boostPower(int amount) {
        powerlevel = powerlevel + amount;
    }

    public static Robot findStrongestRobot(ArrayList<Robot> robots) {
        Robot highestPower = robots.get(0);
        for (Robot r : robots) {
            if (r.getPowerlevel() > highestPower.getPowerlevel()) {
                highestPower = r;
            }
        }
        return highestPower;
    }

    @Override
    public String toString() {
        return name + " - " + powerlevel + " - " + speed;
    }
}
