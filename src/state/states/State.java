package state.states;

import state.PaymentContext;

public abstract class State {
    private final PaymentContext context;

    public State(PaymentContext context) {
        this.context = context;
    }

    public abstract void process();
    public abstract void refund();

    public PaymentContext getContext() {
        return context;
    }
}
