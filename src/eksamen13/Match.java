package eksamen13;

public class Match {
    private int team1score;
    private int team2score;

    public Match(int team1score, int team2score) {
        this.team1score = team1score;
        this.team2score = team2score;
    }
    public int getTeam1score() {
        return team1score;
    }
    public int getTeam2score(){
        return team2score;
    }

    public void setTeam1score(int team1score) {
        this.team1score = team1score;
    }
    public void setTeam2(int team2score) {
        this.team2score = team2score;
    }

    public String getWinner(){
        if (team1score > team2score) {
            return "team 1 vinder";
        } else if ( team2score > team1score){
            return "Team 2 vinder";
        } else {
            return "tie";
        }
    }

    @Override
    public String toString() {
        return team1score + " til " + team2score;
    }
}
