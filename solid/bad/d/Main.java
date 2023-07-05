package solid.bad.d;

public class Main {
    public static void main(String args[]) {

        String paymentMethod = "Credit card";
        PaymentManager paymentManager = new PaymentManager();
        double paymentAmount = 100.0;

        if(paymentMethod == "Credit card") {
            paymentManager.processCreditCardPayment(paymentAmount);
        } else if(paymentMethod == "Paypal") {
            paymentManager.processPaypalPayment(paymentAmount);
        } else {
            System.out.println("Please select a valid payment method");
        }
        paymentManager.authorizePayment(paymentAmount);
        paymentManager.validatePayment(paymentAmount);
        paymentManager.generateInvoice(paymentAmount);
        paymentManager.sendPaymentConfirmation(paymentAmount);
        paymentManager.refundPayment(paymentAmount);
        paymentManager.recordPayment(paymentAmount);
        paymentManager.processMonthlyStatement();
        paymentManager.updatePaymentMethod("Paypal");
        paymentManager.notifyLatePayment();
        paymentManager.initiatePaymentReversal(paymentAmount);
        paymentManager.validateRefund(paymentAmount);
        paymentManager.updateCustomerBalance(paymentAmount);
        paymentManager.sendPaymentReceipt(paymentAmount);
        paymentManager.processPaymentCancellation();
        paymentManager.issuePaymentChargeback();
        paymentManager.calculatePaymentTax(paymentAmount);
    }
}
