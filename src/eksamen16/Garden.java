package eksamen16;

import java.util.ArrayList;

public class Garden {
        ArrayList<Flower> flowers = new ArrayList<>();

        public void addFlower(Flower flower) {
            flowers.add(flower);
        }

        public ArrayList<Flower> sortFlowerByColor(String color) {
            ArrayList<Flower> specific = new ArrayList<>();
            for (Flower f : flowers) {
                if (f.getColor().equals(color)) {
                    specific.add(f);
                }
            }
            return specific;
        }




}
