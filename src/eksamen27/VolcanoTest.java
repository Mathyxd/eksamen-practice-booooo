package eksamen27;

public class VolcanoTest {
    public static void main(String[] args) {
        Volcano volcano = new Volcano();

        try {
            volcano.measureTemperature(999);

            volcano.measureTemperature(1001);
        } catch (TooHotException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
