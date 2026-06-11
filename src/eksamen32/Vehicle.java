package eksamen32;

import java.util.ArrayList;

public abstract class Vehicle {
    private int fuel;
    private int speed;

    public Vehicle(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }
    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void refuel(int amount) {
        fuel = fuel + amount;
    }

    public static void printStatus(ArrayList<Vehicle> vehicles) {
        ArrayList<Vehicle> print = new ArrayList<>();
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        return fuel + " - " + speed;
    }
}
