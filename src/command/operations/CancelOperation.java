package command.operations;

public class CancelOperation implements PaymentOperation {
    private final String transactionId;

    public CancelOperation(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public void performOperation() {
        System.out.println("[Receiver] Cancelling transaction " + transactionId);
    }

    @Override
    public void undoOperation() {
        System.out.println("[Receiver] Reactivating cancelled transaction " + transactionId);
    }
}
