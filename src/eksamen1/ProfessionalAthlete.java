package eksamen1;


import java.util.ArrayList;

public class ProfessionalAthlete extends Athlete {

    public ProfessionalAthlete(String name, boolean isActive, ArrayList points) {
        super(name, isActive, points);
    }
    public int getNumberOfWins() {
        return points.size();
    }
}
