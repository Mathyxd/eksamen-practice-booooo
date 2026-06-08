package eksamen17;

import java.util.ArrayList;

public class ToyStore {
    ArrayList<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy getMostPopular() {
        Toy mostPopular = toys.get(0);
        for (Toy t : toys) {
            if (t.getPopularityScore() > mostPopular.getPopularityScore()) {
                mostPopular = t;
            }
        }
        return mostPopular;
    }
}
