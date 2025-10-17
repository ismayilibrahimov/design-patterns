package factory.abstract_factory.receipts;

public class BankTransferReceipt implements Receipt {
    @Override
    public void generate(double amount) {
        System.out.println("Bank transfer of $" + amount + " received.");
    }
}
