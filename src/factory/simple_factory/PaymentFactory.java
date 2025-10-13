package factory.simple_factory;


public class PaymentFactory {
    public static Payment createPaymentMethod(String type) {
        if (type.equalsIgnoreCase("creditcard")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        } else if (type.equalsIgnoreCase("banktransfer")) {
            return new BankTransferPayment();
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
