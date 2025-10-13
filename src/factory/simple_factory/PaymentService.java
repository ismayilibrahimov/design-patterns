package factory.simple_factory;


public class PaymentService {
    public void makePayment(String type, double amount) {
        Payment paymentMethod = PaymentFactory.createPaymentMethod(type);
        paymentMethod.pay(amount);
    }
}