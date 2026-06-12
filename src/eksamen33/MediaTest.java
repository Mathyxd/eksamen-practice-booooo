package eksamen33;

import java.util.ArrayList;

public class MediaTest {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<>();

        Video v1 = new Video("how to delivery",2,"16:2");
        Audio a1 = new Audio("sound",5,"-10.4dB");
        Video v2 = new Video("how to delivery2",4,"16:4");
        Audio a2 = new Audio("sound2",6,"-11.4dB");

        mediaList.add(v1);
        mediaList.add(a1);
        mediaList.add(v2);
        mediaList.add(a2);

        Media.saveToFile(mediaList);
        System.out.println("gemt");
    }
}
