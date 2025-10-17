package factory.abstract_factory.factories;

import factory.abstract_factory.payment_methods.CreditCardPayment;
import factory.abstract_factory.payment_methods.Payment;
import factory.abstract_factory.receipts.CreditCardReceipt;
import factory.abstract_factory.receipts.Receipt;


public class CreditCardFactory implements PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new CreditCardPayment();
    }

    @Override
    public Receipt generateReceipt() {
        return new CreditCardReceipt();
    }
}
