package eksamen2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Playlist {
    ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);

    }

    public double getTotalDuration() {
        double total = 0;
        for (Song s : songs) {
            total = total + s.getDuration();
        }
        return total;
    }
    public void save() {
        String filePath = "songs.csv"; //det er hvor den finder csv filen

        try {
            FileWriter writer = new FileWriter(filePath); // starter filewrtier og skriver det til filepath
            for (Song s : songs) {
                writer.write(s.getTitle() + "," + s.getArist() + "," + s.getDuration() + "\n"); //det er linjen der bliver skrevvet ned til csv filen
            }
            writer.close(); //slutter writeren
            System.out.println("gemt");
        } catch (IOException e) { //IOException til når der er fejl i skrivning)
            System.out.println("wrong");
        }
    }
}

