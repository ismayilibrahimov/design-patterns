package command.commands;

import command.operations.CaptureOperation;


public class CaptureCommand implements Command {
    private final CaptureOperation operation;

    public CaptureCommand(CaptureOperation operation) {
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
