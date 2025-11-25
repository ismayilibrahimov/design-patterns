package state.states;

import state.PaymentContext;

public class CreatedState extends State {
    public CreatedState(PaymentContext context) {
        super(context);
    }

    @Override
    public void process() {
        System.out.println("Validating card...");
        System.out.println("Reserving balance...");
        getContext().setState(new ProcessingState(getContext()));
        getContext().getState().process();
    }

    @Override
    public void refund() {
        System.out.println("You cannot refund at created state");
    }
}
