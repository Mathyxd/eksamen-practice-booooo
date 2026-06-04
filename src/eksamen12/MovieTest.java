package eksamen12;

import java.util.ArrayList;
import java.util.Collections;

public class MovieTest {

    public void main() {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("batman", "mig", 2));
        movies.add(new Movie("batman2", "mig2", 6));
        movies.add(new Movie("batman3", "mig3", 5));
        movies.add(new Movie("batman4", "mig4", 4));
        movies.add(new Movie("batman5", "mig5", 10));

        Collections.sort(movies);
        System.out.println("sorteret efter rating");

        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
