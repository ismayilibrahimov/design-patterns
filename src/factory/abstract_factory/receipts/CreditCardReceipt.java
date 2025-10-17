package factory.abstract_factory.receipts;

public class CreditCardReceipt implements Receipt {
    @Override
    public void generate(double amount) {
        System.out.println("Credit card payment of $" + amount + " received.");
    }
}
