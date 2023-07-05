package solid.good.d;

public class PaypalProcessor implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment: $" + amount);
    }
}
