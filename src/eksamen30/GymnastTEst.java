package eksamen30;

import java.util.ArrayList;

public class GymnastTEst {
    public void main() {
        ArrayList<Gymnast> gymnasts = new ArrayList<>();

        Gymnast g1 = new Gymnast("henrik","danmark",5.4);
        Gymnast g2 = new Gymnast("Henrik2","sverige",10.3);
        Gymnast g3 = new Gymnast("henrik3","danmark",2.4);
        Gymnast g4 = new Gymnast("Henrik4","sverige",11.3);

        gymnasts.add(g1);
        gymnasts.add(g2);
        gymnasts.add(g3);
        gymnasts.add(g4);

        g1.updateScore(6.4);
        System.out.println(g1);

        System.out.println(Gymnast.findBestGymnast(gymnasts));
    }
}
