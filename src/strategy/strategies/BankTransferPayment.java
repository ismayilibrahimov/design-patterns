package strategy.strategies;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println( "Paying with bank transfer");
    }
}
