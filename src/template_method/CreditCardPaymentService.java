package template_method;

public class CreditCardPaymentService extends PaymentService {
    public CreditCardPaymentService() {
        super("CreditCard");
    }

    @Override
    protected void connectGateway() {
        System.out.println("Connecting to credit card gateway...");
        // ... connection logic
    }

    @Override
    protected void executePayment(double amount) {
        System.out.println("Executing credit card payment of $" + amount);
        // ... execution logic
    }
}
