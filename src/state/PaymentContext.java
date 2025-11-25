package state;

import state.states.CreatedState;
import state.states.State;

public class PaymentContext {
    private final String id;
    private State state;

    public PaymentContext(String id) {
        this.id = id;
        this.state = new CreatedState(this);
    }

    public String getId() {
        return id;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
