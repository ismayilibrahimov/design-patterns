package state.states;

import state.PaymentContext;

public class SuccessState extends State {
    public SuccessState(PaymentContext context) {
        super(context);
    }

    @Override
    public void process() {
        System.out.println("You cannot process at success state");
    }

    @Override
    public void refund() {
        System.out.println("Process refund");
        getContext().setState(new RefundedState(getContext()));
    }
}
