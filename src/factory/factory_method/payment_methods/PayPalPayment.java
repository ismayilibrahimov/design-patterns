package factory.factory_method.payment_methods;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
