package eksamen13;

import java.util.ArrayList;

public class MatchTest {
    public static void main(String[] args) {
        ArrayList<Match> matches = new ArrayList<>();

        matches.add(new Match(3,1));
        matches.add(new Match(50,1));
        matches.add(new Match(28,30));
        matches.add(new Match(2,5));
        matches.add(new Match(5,10));

        for (Match m : matches) {
            System.out.println(m.getWinner());
        }

        Match highestScore = matches.get(0);
        for (Match m : matches) {
            if (Math.abs(m.getTeam1score() - m.getTeam2score()) > Math.abs(highestScore.getTeam1score() - highestScore.getTeam2score())) {
                highestScore = m;
            }
        }
        System.out.println("højeste score: " + highestScore );
    }
}
