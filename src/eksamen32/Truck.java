package eksamen32;

public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(int fuel, int speed, int cargoCapacity) {
        super(fuel,speed);
        this.cargoCapacity = cargoCapacity;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String toString() {
        return "caroge load: " + cargoCapacity + super.toString();
    }
}
