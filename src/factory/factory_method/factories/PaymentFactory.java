package factory.factory_method.factories;

import factory.factory_method.payment_methods.Payment;


public interface PaymentFactory {
    Payment createPaymentMethod();
}
