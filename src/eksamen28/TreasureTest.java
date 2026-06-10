package eksamen28;

import java.util.ArrayList;

public class TreasureTest {
    public static void main(String[] args) {
        ArrayList<Treasure> treasures = new ArrayList<>();

        Treasure t1 = new Treasure("one piece1",5,"white ocean2");
        Treasure t2 = new Treasure("one piece2",26,"white ocean3");
        Treasure t3 = new Treasure("one piece3",7,"white ocean4");
        Treasure t4 = new Treasure("one piece4",8,"white ocean5");
        Treasure t5 = new Treasure("one piece5",10,"white ocean6");

        treasures.add(t1);
        treasures.add(t2);
        treasures.add(t3);
        treasures.add(t4);
        treasures.add(t5);

        t1.increaseValue(20);
        System.out.println(t1);

        System.out.println(Treasure.findBiggestTreasure(treasures));
    }
}
