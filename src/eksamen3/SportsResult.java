package eksamen3;

import java.util.Random;

public class SportsResult {
    private String team1;
    private String team2;
    private String result;
    private Random random;

    public SportsResult (String team1, String team2, String result) {
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
        this.random = new Random();
    }

    public String getTeam1() {
        return team1;
    }
    public String getTeam2() {
        return team2;
    }
    public String getResult() {
        return result;
    }
    public void setTeam1(String team1) {
        this.team1 = team1;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    public void setResult(String result) {
        this.result = result;
    }

    public void generateRandomResult() {
        int kamp = random.nextInt(3);
        if (kamp == 0) {
            result = "Uafgjort";
        } else if (kamp == 1) {
            result = getTeam1() + "Vinder";
        } else {
            result = getTeam2() + "Vinder";
        }
    }

}
