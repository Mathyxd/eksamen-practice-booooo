package eksamen30;

import java.util.ArrayList;

public class Gymnast {
    private String name;
    private String country;
    private double score;

    public Gymnast(String name, String country, double score) {
        this.name = name;
        this.country = country;
        this.score= score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateScore(double newScore) {
        if (score < newScore) {
            score = newScore;
        }
    }

    public static Gymnast findBestGymnast(ArrayList<Gymnast> gymnasts) {
        Gymnast highestScore = gymnasts.get(0);
        for (Gymnast g : gymnasts) {
            if (g.score > highestScore.score) {
                highestScore = g;
            }
        }
        return highestScore;
    }

    @Override
    public String toString() {
        return name + " - " + country + " - " + score;
    }
}
