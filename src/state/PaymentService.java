package state;

public class PaymentService {
    public void handle(PaymentContext context) {
        context.getState().process();
    }
}
