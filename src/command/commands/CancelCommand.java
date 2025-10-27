package command.commands;

import command.operations.CancelOperation;


public class CancelCommand implements Command {
    private final CancelOperation operation;

    public CancelCommand(CancelOperation operation) {
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
