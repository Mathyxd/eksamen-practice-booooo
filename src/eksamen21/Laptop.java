package eksamen21;

import java.util.ArrayList;

public class Laptop {
    private String brand;
    private String model;
    private int batteryPercentage;

    public Laptop(String brand, String model, int batteryPercentage) {
        this.brand = brand;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public void charge(int battery) {
        if (batteryPercentage + battery > 100) {
            batteryPercentage = 100;
        } else {
            batteryPercentage = batteryPercentage + battery;
        }
    }

    public void getLowBattery(ArrayList<Laptop> laptops) {
        ArrayList<Laptop> lowBattery = new ArrayList<>();
        for (Laptop l : laptops) {
            if (l.getBatteryPercentage() < 20) {
                lowBattery.add(l);
                System.out.println(l);
            }
        }
    }

    @Override
    public String toString() {
        return brand + " - " + model + " - " + batteryPercentage;
    }
}