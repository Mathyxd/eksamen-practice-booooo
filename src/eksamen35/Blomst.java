package eksamen35;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Blomst implements Comparable<Blomst> {
    private String name;
    private String farve;
    private double afklipningslængde;
    private Random random;

    public Blomst(String name, String farve) {
        this.name = name;
        this.farve = farve;
        this.random = new Random();
        this.afklipningslængde = random.nextDouble() * 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void saveToFile(ArrayList<Blomst> blomster) {
        try {
            FileWriter writer = new FileWriter("blomster.txt");
            for (Blomst b : blomster) {
                writer.write(b + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("fejl");
        }
    }

    @Override
    public int compareTo(Blomst other) {
        return Double.compare(this.afklipningslængde, other.afklipningslængde);
    }

    @Override
    public String toString() {
        return name + " - " + farve + " - " + afklipningslængde;
    }
}
