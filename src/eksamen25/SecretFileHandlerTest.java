package eksamen25;

public class SecretFileHandlerTest {
    public void main() {
        SecretFileHandler secretFileHandler = new SecretFileHandler();

        secretFileHandler.saveSecret("uuuuh", "secret.txt");
        System.out.println(secretFileHandler.readSecret("secret.txt"));

    }


}
