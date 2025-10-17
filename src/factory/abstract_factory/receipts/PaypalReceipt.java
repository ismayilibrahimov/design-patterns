package factory.abstract_factory.receipts;

public class PaypalReceipt implements Receipt {
    @Override
    public void generate(double amount) {
        System.out.println("Paypal payment of $" + amount + " received.");
    }
}
