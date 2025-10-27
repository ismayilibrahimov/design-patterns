package command;

import command.commands.Command;
import java.util.Stack;


public class PaymentService {
    private Command command;
    private final Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void processOperation() {
        if (command == null) throw new IllegalArgumentException("No command set");
        command.execute();
        history.push(command);
    }

    public void undoLastOperation() {
        if (history.isEmpty()) {
            System.out.println("No operations to undo");
            return;
        }
        Command lastCommand = history.pop();
        lastCommand.undo();
    }
}
