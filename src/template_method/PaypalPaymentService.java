package template_method;

public class PaypalPaymentService extends PaymentService {
    public PaypalPaymentService() {
        super("Paypal");
    }

    @Override
    protected void connectGateway() {
        System.out.println("Connecting to PayPal gateway...");
        // ... connection logic
    }

    @Override
    protected void executePayment(double amount) {
        System.out.println("Executing PayPal payment of $" + amount);
        // ... execution logic
    }

    @Override
    protected boolean shouldSendReceipt() {
        return false;
    }
}
