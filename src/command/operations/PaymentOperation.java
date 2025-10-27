package command.operations;

public interface PaymentOperation {
    void performOperation();
    void undoOperation();
}
