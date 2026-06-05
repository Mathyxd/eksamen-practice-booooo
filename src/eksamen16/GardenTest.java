package eksamen16;

import java.util.ArrayList;

public class GardenTest {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.addFlower(new Flower("kola","rød"));
        garden.addFlower(new Flower("kola3","grøn"));
        garden.addFlower(new Flower("kola2","blå"));
        garden.addFlower(new Flower("kola4","blå"));


        ArrayList<Flower> sortColor = garden.sortFlowerByColor("rød");
        for (Flower f : sortColor) {
            System.out.println(f);
        }


    }

}
