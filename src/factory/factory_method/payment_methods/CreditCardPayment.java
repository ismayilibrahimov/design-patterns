package factory.factory_method.payment_methods;


public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
