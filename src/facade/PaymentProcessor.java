package facade;


public class PaymentProcessor {
    public void processTransaction(String cardNumber, double amount) {
        System.out.println("Processing payment of $" + amount + " for card: " + cardNumber);
    }
}
