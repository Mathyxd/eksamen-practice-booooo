package eksamen33;

public class Audio extends Media {
    private String loudness;

    public Audio(String name, int duration, String loudness) {
        super(name, duration);
        this.loudness = loudness;
    }

    public String getLoudness() {
        return loudness;
    }

    public void setLoudness(String loudness) {
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + loudness;
    }
}
