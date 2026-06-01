package eksamen2;

public class Song {
    private String title;
    private String artist;
    private double duration;

    public Song (String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public String getArist() {
        return artist;
    }
    public double getDuration() {
        return duration;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }
    @Override
    public String toString() {return title + " " + artist + " " + duration;}
}
