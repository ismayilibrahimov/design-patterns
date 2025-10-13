package factory.factory_method.factories;

import factory.factory_method.payment_methods.CreditCardPayment;
import factory.factory_method.payment_methods.Payment;


public class CreditCardFactory implements PaymentFactory {
    public Payment createPaymentMethod() {
        return new CreditCardPayment();
    }
}
