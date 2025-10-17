package factory.abstract_factory.payment_methods;


public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
    }
}
