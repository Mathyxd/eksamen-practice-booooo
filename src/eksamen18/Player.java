package eksamen18;

public class Player {
    private String name;
    private int highScore;

    public Player(String name, int highScore) {
        this.name = name;
        this.highScore = highScore;
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void updateScore(int newScore) {
        if (newScore > highScore) {
            highScore = newScore;
        }

    }

    @Override
    public String toString() {
        return name + " - " + highScore;
    }
}
