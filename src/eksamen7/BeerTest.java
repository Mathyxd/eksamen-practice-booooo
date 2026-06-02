package eksamen7;

import java.util.ArrayList;

public class BeerTest {
    public void main() {
        ArrayList<Beer> beers = new ArrayList<>();

        beers.add(new Beer("classic", 12,15));
        beers.add(new Beer("pilsner", 32,95));
        beers.add(new Beer("svaneke", 99,800));
        beers.add(new Beer("dragapult", 9,70));
        beers.add(new Beer("idk", 20,35));

        int total = 0;
        for (Beer b : beers) {
            total = total + b.getPrice();
            System.out.println(b);
        }
        int gennemsnit = total / beers.size();
        System.out.println("gennemsnitpris: " + gennemsnit);
    }
}
