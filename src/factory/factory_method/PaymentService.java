package factory.factory_method;

import factory.factory_method.factories.PaymentFactory;


public class PaymentService {
    private PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void makePayment(double amount) {
        paymentFactory.createPaymentMethod().pay(amount);
    }
}
