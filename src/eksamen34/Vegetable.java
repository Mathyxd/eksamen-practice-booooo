package eksamen34;

public class Vegetable extends Food{
    private String season;

    public Vegetable(String name, int price, String season) {
        super(name, price);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + season;
    }
}
