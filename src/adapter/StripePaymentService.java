package adapter;


public class StripePaymentService {
    public void makeStripeCharge(int valueInCents) {
        System.out.println("Charging via Stripe: " + valueInCents + " cents");
    }
}
