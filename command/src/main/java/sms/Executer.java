package sms;

import sms.command.*;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by jakub on 27.02.2017.
 */
public class Executer {

    private PrintCommand printCommand = new PrintCommand();
    private Deque<Command> commands = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();
    private boolean isLastExecutedCommandRedoable;

    public void executeCommand(final CommandMetadata commandMetadata, final SquareRepository squareRepository) {
        switch (commandMetadata.getCommandShortcut()) {
            case C:
                execute(new CreationCommand(), squareRepository, commandMetadata);
                break;
            case M:
                execute(new MoveCommand(), squareRepository, commandMetadata);
                break;
            case S:
                execute(new ScaleCommand(), squareRepository, commandMetadata);
                break;
            case U:
                undo();
                break;
            case R:
                redo();
                break;
            case P:
                printCommand.execute(squareRepository);
                break;
        }
    }

    private void execute(final Command command, final SquareRepository squareRepository, final CommandMetadata commandMetadata) {
        command.execute(squareRepository, commandMetadata);
        commands.addLast(command);
        isLastExecutedCommandRedoable = false;
    }

    private void undo() {
        final Command command = commands.pollLast();
        if (command != null) {
            command.undo();
            redoStack.addLast(command);
            isLastExecutedCommandRedoable = true;
        }
    }

    private void redo() {
        final Command command = redoStack.pollLast();
        if (isCommandRedoable(command)) {
            command.redo();
            commands.addLast(command);
        }
    }

    private boolean isCommandRedoable(final Command command) {
        return command != null && isLastExecutedCommandRedoable;
    }
}
