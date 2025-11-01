package facade;


public class FraudChecker {
    public boolean checkFraud(String cardNumber, double amount) {
        System.out.println("Checking fraud for card: " + cardNumber + " amount: " + amount);
        return !cardNumber.startsWith("0000"); // Fake rule: card numbers starting with 0000 are fraudulent
    }
}
