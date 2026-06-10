package eksamen26;

import java.util.ArrayList;

public class ContestantTest {
    public static void main(String[] args) {
        ArrayList<Contestant> contestants = new ArrayList<>();

        Contestant lugas = new Contestant("Lugas", 5);
        Contestant lugas1 = new Contestant("Lugas1", 3);
        Contestant lugas2 = new Contestant("Lugas2", 6);
        Contestant lugas3 = new Contestant("Lugas3", 8);
        Contestant lugas4 = new Contestant("Lugas4", 10);

        contestants.add(lugas);
        contestants.add(lugas1);
        contestants.add(lugas2);
        contestants.add(lugas3);
        contestants.add(lugas4);

        lugas.eatBurger(3);
        System.out.println(lugas);

        System.out.println("Vinderen er: " + Contestant.findChampion(contestants));
    }
}
