package state.states;

import state.PaymentContext;

public class FailedState extends State {
    public FailedState(PaymentContext context) {
        super(context);
    }

    @Override
    public void process() {
        System.out.println("You cannot do anything at failed state!");
    }

    @Override
    public void refund() {
        System.out.println("You cannot refund at failed state!");
    }
}
