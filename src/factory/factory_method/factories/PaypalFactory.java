package factory.factory_method.factories;

import factory.factory_method.payment_methods.PayPalPayment;
import factory.factory_method.payment_methods.Payment;


public class PaypalFactory implements PaymentFactory {
    public Payment createPaymentMethod() {
        return new PayPalPayment();
    }
}
