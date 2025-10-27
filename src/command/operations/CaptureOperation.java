package command.operations;

import java.math.BigDecimal;

public class CaptureOperation implements PaymentOperation {
    private final String transactionId;
    private final BigDecimal amount;

    public CaptureOperation(String transactionId, BigDecimal amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    @Override
    public void performOperation() {
        System.out.println("[Receiver] Capturing " + amount + " for " + transactionId);
    }

    @Override
    public void undoOperation() {
        System.out.println("[Receiver] Reversing capture of " + amount + " for " + transactionId);
    }
}
