package facade;


public class PaymentFacade {
    private final String apiKey;
    private final PaymentGateway paymentGateway;
    private final FraudChecker fraudChecker;
    private final BalanceVerifier balanceVerifier;
    private final PaymentProcessor paymentProcessor;

    public PaymentFacade(String apiKey) {
        this.apiKey = apiKey;
        this.paymentGateway = new PaymentGateway();
        this.balanceVerifier = new BalanceVerifier();
        this.fraudChecker = new FraudChecker();
        this.paymentProcessor = new PaymentProcessor();
    }

    public void makePayment(String cardNumber, double amount) {
        if (!paymentGateway.authenticate(apiKey)) {
            System.out.println("Authentication failed!");
            return;
        }

        if (!fraudChecker.checkFraud(cardNumber, amount)) {
            System.out.println("Fraud detected! Payment blocked.");
            return;
        }

        if (!balanceVerifier.hasSufficientBalance(cardNumber, amount)) {
            System.out.println("Insufficient balance!");
            return;
        }

        paymentProcessor.processTransaction(cardNumber, amount);

        System.out.println("Payment completed successfully!");
    }
}
