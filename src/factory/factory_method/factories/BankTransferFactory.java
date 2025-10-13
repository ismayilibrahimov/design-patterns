package factory.factory_method.factories;

import factory.factory_method.payment_methods.BankTransferPayment;
import factory.factory_method.payment_methods.Payment;


public class BankTransferFactory implements PaymentFactory {
    public Payment createPaymentMethod() {
        return new BankTransferPayment();
    }
}
