package state.states;

import state.PaymentContext;

public class ProcessingState extends State {
    public ProcessingState(PaymentContext context) {
        super(context);
    }

    @Override
    public void process() {
        System.out.println("Calling banking gateway...");
        boolean response = callBankGateway();

        if (response) {
            System.out.println("PAYMENT SUCCESSFUL");
            getContext().setState(new SuccessState(getContext()));
        } else {
            System.out.println("PAYMENT FAILED");
            getContext().setState(new FailedState(getContext()));
        }
    }

    @Override
    public void refund() {
        System.out.println("You cannot refund at processing state");
    }

    private boolean callBankGateway() {
        return Math.random() > 0.5;
    }
}
