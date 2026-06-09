package eksamen21;

import java.util.ArrayList;

public class LaptopTest {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();

        Laptop l1 = new Laptop("mercedes", "supercomputer", 80);
        Laptop l2 = new Laptop("mercedes2", "supercomputer2", 29);
        Laptop l3 = new Laptop("mercedes3", "supercompute3r", 100);

        laptops.add(l1);
        l1.charge(21);
        laptops.add(l2);
        l2.getLowBattery(laptops);

        System.out.println(l1);
    }
}
