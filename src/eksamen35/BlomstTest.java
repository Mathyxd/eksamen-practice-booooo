package eksamen35;

import java.util.ArrayList;
import java.util.Collections;

public class BlomstTest {
    public static void main(String[] args) {
        ArrayList<Blomst> blomster = new ArrayList<>();

        blomster.add(new Blomst("bob","rød1"));
        blomster.add(new Blomst("bob1","rød2"));
        blomster.add(new Blomst("bob2","rød3"));
        blomster.add(new Blomst("bob3","rød4"));
        blomster.add(new Blomst("bob4","rød5"));
        blomster.add(new Blomst("bob5","rød6"));
        blomster.add(new Blomst("bob6","rød7"));
        blomster.add(new Blomst("bob7","rød8"));
        blomster.add(new Blomst("bob8","rød9"));
        blomster.add(new Blomst("bob9","rød10"));

        Collections.sort(blomster);
        Blomst.saveToFile(blomster);
        System.out.println("blomster er sorteret og gemt til filen");
    }
}
