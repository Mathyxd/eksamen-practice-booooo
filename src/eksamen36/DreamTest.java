package eksamen36;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class DreamTest {
    public static void main(String[] args) {
        ArrayList<Dream> dreams = new ArrayList<>();

        Dream d1 = new Dream(LocalDate.of(2026, 5, 6),2, Type.MARERIDT);
        Dream d2 = new Dream(LocalDate.of(2026,4,5), 11,Type.PROBLEMLØSENDE);
        Dream d3 = new Dream(LocalDate.of(2018,9,10), 11,Type.NEUTRAL);

        dreams.add(d1);
        dreams.add(d2);
        dreams.add(d3);
        Collections.sort(dreams);
        System.out.println("sorteret");
        System.out.println(d3.isPleasant());

        for (Dream d : dreams) {
            System.out.println(d);
        }

    }
}
