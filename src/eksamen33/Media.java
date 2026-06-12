package eksamen33;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Media {
    private String name;
    private int duration;

    public Media(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void saveToFile(ArrayList<Media> mediaList) {
        try {
            FileWriter writer = new FileWriter("mediaInfo.txt");
            for (Media m : mediaList) {
                writer.write(m + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("fejl");
        }
    }


    @Override
    public String toString() {
        return name + " - " + duration;
    }
}
