package eksamen24;

public class Car extends Vehicle{
    private int passengerCount;

    public Car(int fuel, int speed, int passengerCount) {
        super(fuel, speed);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public String toString() {
        return "Passagerer: " + passengerCount + " - " + super.toString();
    }
}
