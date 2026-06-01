package eksamen2;

public class PlaylistTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("lambo", "KSI", 4.1));
        playlist.addSong(new Song("boobies", "KSI", 6.7));
        playlist.addSong(new Song("bomba", "KSI", 2.5));

        System.out.println("total varighed: " + playlist.getTotalDuration());
        playlist.save();
    }
}
