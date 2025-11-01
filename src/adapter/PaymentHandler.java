package adapter;


public class PaymentHandler {
    private final BankPaymentProcessor bankProcessor;

    public PaymentHandler(BankPaymentProcessor bankProcessor) {
        this.bankProcessor = bankProcessor;
    }

    public void handlePayment(double amount) {
        bankProcessor.processBankPayment(amount);
    }
}

