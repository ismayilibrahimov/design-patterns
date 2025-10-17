package factory.abstract_factory;

import factory.abstract_factory.factories.PaymentFactory;


public class PaymentService {
    private final PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void makePayment(double amount) {
        paymentFactory.createPaymentMethod().pay(amount);
        paymentFactory.generateReceipt().generate(amount);
    }
}
