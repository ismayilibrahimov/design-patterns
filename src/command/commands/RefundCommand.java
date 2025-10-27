package command.commands;

import command.operations.RefundOperation;


public class RefundCommand implements Command {
    private final RefundOperation operation;

    public RefundCommand(RefundOperation operation) {
        this.operation = operation;
    }

    @Override
    public void execute() {
        operation.performOperation();
    }

    @Override
    public void undo() {
        operation.undoOperation();
    }
}
