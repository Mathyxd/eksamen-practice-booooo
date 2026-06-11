package eksamen31;

import java.util.ArrayList;

public class FighterTest {
    public void main() {
        ArrayList<Fighter> fighters = new ArrayList<>();

        Hero hero1 = new Hero();
        Villain villain1 = new Villain();
        Hero hero2 = new Hero();
        Villain villain2 = new Villain();

        fighters.add(hero1);
        fighters.add(villain1);
        fighters.add(hero2);
        fighters.add(villain2);


        System.out.println(hero1.attack() + "\n" + villain1.attack());
    }
}
