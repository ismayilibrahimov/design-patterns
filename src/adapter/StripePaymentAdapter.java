package adapter;


public class StripePaymentAdapter extends BankPaymentProcessor {
    private final StripePaymentService stripeService;

    public StripePaymentAdapter(StripePaymentService stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void processBankPayment(double amount) {
        stripeService.makeStripeCharge((int) (amount * 100));
    }
}
