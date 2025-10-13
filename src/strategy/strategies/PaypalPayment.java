package strategy.strategies;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println( "Paying with Paypal");
    }
}
