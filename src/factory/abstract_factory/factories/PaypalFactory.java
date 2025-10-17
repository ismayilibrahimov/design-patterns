package factory.abstract_factory.factories;

import factory.abstract_factory.payment_methods.PayPalPayment;
import factory.abstract_factory.payment_methods.Payment;
import factory.abstract_factory.receipts.PaypalReceipt;
import factory.abstract_factory.receipts.Receipt;


public class PaypalFactory implements PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new PayPalPayment();
    }

    @Override
    public Receipt generateReceipt() {
        return new PaypalReceipt();
    }
}
