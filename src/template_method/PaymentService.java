package template_method;

abstract public class PaymentService {
    private final String gateway;

    public PaymentService(String gateway) {
        this.gateway = gateway;
    }

    public final void processPayment(double amount) {
        startPayment();

        // Step 1: Validate payment details
        validatePayment();

        // Step 2: Connect to payment gateway
        connectGateway();

        // Step 3: Execute payment
        executePayment(amount);

        // Step 4: Send receipt
        if (shouldSendReceipt()) {
            sendReceipt();
        }

        completePayment();
    }

    private void startPayment() {
        System.out.printf("Starting %s payment...%n", gateway);
    }

    private void validatePayment() {
        System.out.printf("Validating %s account...%n", gateway);
        // ... some validation logic
    }

    protected abstract void connectGateway();

    protected abstract void executePayment(double amount);

    private void sendReceipt() {
        System.out.printf("Sending receipt for %s payment.%n", gateway);
        // ... receipt logic
    }

    private void completePayment() {
        System.out.printf("%s payment completed.%n", gateway);
    }

    protected boolean shouldSendReceipt() {
        return true;
    }
}
