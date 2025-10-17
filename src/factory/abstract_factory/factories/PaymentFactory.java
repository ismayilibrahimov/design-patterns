package factory.abstract_factory.factories;

import factory.abstract_factory.payment_methods.Payment;
import factory.abstract_factory.receipts.Receipt;


public interface PaymentFactory {
    Payment createPaymentMethod();
    Receipt generateReceipt();
}
