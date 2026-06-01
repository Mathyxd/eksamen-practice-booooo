package eksamen1;

import java.util.ArrayList;

public class AthleteTest {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        ProfessionalAthlete pro = new ProfessionalAthlete("mathias", true, points);
        pro.getPoints().add(10);
        pro.getPoints().add(5);
        pro.getPoints().add(67);

        System.out.println("Antal wins: " + pro.getNumberOfWins());

        AmatuerAthlete noob = new AmatuerAthlete("henrik",true,points,true);
        System.out.println(noob.getName() + " har betalt: " + noob.hasPaidFee());
    }
}
