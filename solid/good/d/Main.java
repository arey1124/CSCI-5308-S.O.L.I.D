package solid.good.d;

public class Main {
    public static void main(String args[]) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor paypalProcessor = new PaypalProcessor();

        PaymentManager paymentManager1 = new PaymentManager(creditCardProcessor);
        PaymentManager paymentManager2 = new PaymentManager(paypalProcessor);

        double paymentAmount = 100.0;

        paymentManager1.processPayment(paymentAmount);
        paymentManager2.processPayment(paymentAmount);

        paymentManager1.authorizePayment(paymentAmount);
        paymentManager2.authorizePayment(paymentAmount);

        paymentManager1.validatePayment(paymentAmount);
        paymentManager2.validatePayment(paymentAmount);

        paymentManager1.generateInvoice(paymentAmount);
        paymentManager2.generateInvoice(paymentAmount);

        paymentManager1.sendPaymentConfirmation(paymentAmount);
        paymentManager2.sendPaymentConfirmation(paymentAmount);

        paymentManager1.refundPayment(paymentAmount);
        paymentManager2.refundPayment(paymentAmount);

        paymentManager1.recordPayment(paymentAmount);
        paymentManager2.recordPayment(paymentAmount);

        paymentManager1.processMonthlyStatement();
        paymentManager2.processMonthlyStatement();
    }
}
