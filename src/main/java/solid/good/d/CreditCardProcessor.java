package src.main.java.solid.good.d;

public class CreditCardProcessor implements PaymentProcessor {

    public void processPayment(double amount) {
        // Process payment using credit card
        System.out.println("Processing credit card payment: $" + amount);
    }
}
