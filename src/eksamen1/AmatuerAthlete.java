package eksamen1;


import java.util.ArrayList;

public class AmatuerAthlete extends Athlete {
    private boolean paidFee;

    public AmatuerAthlete (String name, boolean isActive, ArrayList points, boolean paidFee) {
        super(name, isActive, points);
        this.paidFee = paidFee;
    }
    public boolean hasPaidFee() {
        return paidFee;
    }
}
