package eksamen25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecretFileHandler {
    String filePath = "secret.csv";

    public void saveSecret(String secret, String filename) {
        String line;

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(secret);
            writer.close();
        } catch (IOException e) {
            System.out.println("fejl");
        }
    }

    public String readSecret(String filename) {
        String filePath = "secret.csv";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            reader.close();
            return line;
        } catch (IOException e) {
            System.out.println("fejl");
            return null;
        }
    }

}
