package strategy.strategies;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying with credit card");
    }
}
