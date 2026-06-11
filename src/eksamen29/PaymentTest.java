package eksamen29;

import java.util.ArrayList;

public class PaymentTest {
    public static void main(String[] args) {
        ArrayList<Payment> payments = new ArrayList<>();

        CreditCardPayment c1 = new CreditCardPayment();
        PaypalPayment p1 = new PaypalPayment();

        payments.add(c1);
        payments.add(p1);

        c1.processPayment();
        p1.processPayment();

        System.out.println(payments);




    }
}
