package eksamen29;

public class PaypalPayment extends Payment{

    @Override
    public void processPayment() {
        System.out.println( "PayPalPayment processing...");
    }
}
