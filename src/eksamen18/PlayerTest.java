package eksamen18;

import java.util.ArrayList;

public class PlayerTest {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("rahul",2));
        players.add(new Player("rahul2",5));
        players.add(new Player("rahul3",7));
        players.add(new Player("rahul4",20));



        players.get(1).updateScore(100);
        System.out.println(players.get(1));

        Player highestScore = players.get(0);
        for (Player p : players) {
            if (p.getHighScore() > highestScore.getHighScore()) {
                highestScore = p;
            }
        }
        System.out.println("Højeste score: " + highestScore);

    }
}
