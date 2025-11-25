package state.states;

import state.PaymentContext;

public class RefundedState extends State {
    public RefundedState(PaymentContext context) {
        super(context);
    }

    @Override
    public void process() {
        System.out.println("You cannot process anything at refund step");
    }

    @Override
    public void refund() {
        System.out.println("Already refunded!");
    }
}
