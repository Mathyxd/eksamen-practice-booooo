package eksamen32;

import java.util.ArrayList;

public class VehicleTest {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car car1  = new Car(5,10,3);
        Truck truck1 = new Truck(5,10,20);
        Car car2  = new Car(10,100,4);
        Truck truck2 = new Truck(15,100,500);
        Car car3  = new Car(55,150,5);
        Truck truck3 = new Truck(25,110,100);

        vehicles.add(car1);
        vehicles.add(truck2);
        vehicles.add(truck1);
        vehicles.add(car2);

        car1.refuel(20);
        Vehicle.printStatus(vehicles);
    }
}
