package command.operations;

import java.math.BigDecimal;

public class RefundOperation implements PaymentOperation {
    private final String transactionId;
    private final BigDecimal amount;

    public RefundOperation(String transactionId, BigDecimal amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    @Override
    public void performOperation() {
        System.out.println("[Receiver] Refunding " + amount + " for " + transactionId);
    }

    @Override
    public void undoOperation() {
        System.out.println("[Receiver] Undoing refund of " + amount + " for " + transactionId);
    }
}
