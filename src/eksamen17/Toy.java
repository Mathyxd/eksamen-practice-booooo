package eksamen17;

public class Toy {
    private String name;
    private int minimumAge;
    private int popularityScore;

    public Toy(String name, int minimumAge, int popularityScore) {
        this.name = name;
        this.minimumAge = minimumAge;
        this.popularityScore = popularityScore;
    }

    public String getName() {
        return name;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getPopularityScore() {
        return popularityScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public void setPopularityScore(int popularityScore) {
        this.popularityScore = popularityScore;
    }

    public String checkAge(int age) {
        if (age >= minimumAge) {
            return "Gammel nok";
        } else {
            return "Ikke gammel nok";
        }
    }

    @Override
    public String toString() {
        return name + " - " + minimumAge + " - " + popularityScore;
    }


}
