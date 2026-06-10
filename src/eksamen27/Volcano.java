package eksamen27;

public class Volcano {

    public void measureTemperature(double temp) {
        if (temp > 1000) {
            throw new TooHotException("Vulkan er for farm: " + temp);
        }
    }

}
