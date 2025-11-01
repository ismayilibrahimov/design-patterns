package facade;


public class BalanceVerifier {
    public boolean hasSufficientBalance(String cardNumber, double amount) {
        System.out.println("Verifying balance for card: " + cardNumber);
        return amount <= 1000; // Fake rule: only allow transactions up to 1000
    }
}
