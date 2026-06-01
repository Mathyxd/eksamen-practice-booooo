package eksamen3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SportsResultManager {
    ArrayList<SportsResult> results = new ArrayList<>();

    public void addResult(SportsResult result) {
        results.add(result);
    }

    public void save() {
        String filePath = "sportsresult.csv";

        try {
            FileWriter writer = new FileWriter(filePath);
            for (SportsResult r: results) {
                writer.write(r.getTeam1() + "," + r.getTeam2() + "," + r.getResult() + "\n");
            }
            writer.close();
            System.out.println("gem");
        } catch (IOException e) {
            System.out.println("fejl");
        }
    }
}
