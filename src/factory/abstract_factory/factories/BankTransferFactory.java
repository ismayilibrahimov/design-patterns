package factory.abstract_factory.factories;

import factory.abstract_factory.payment_methods.BankTransferPayment;
import factory.abstract_factory.payment_methods.Payment;
import factory.abstract_factory.receipts.BankTransferReceipt;
import factory.abstract_factory.receipts.Receipt;


public class BankTransferFactory implements PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new BankTransferPayment();
    }

    @Override
    public Receipt generateReceipt() {
        return new BankTransferReceipt();
    }
}
