package sms.command;

import sms.Square;
import sms.SquareRepository;

/**
 * Created by jakub on 26.02.2017.
 */
public abstract class Command {

    UndoableCommandDataWrapper undoableDataWrapper;

    public abstract void execute(SquareRepository squareRepository, CommandMetadata commandMetadata);

    public abstract void undo();

    public abstract void redo();

    void saveUndoableData(final Square square,
                          final CommandMetadata commandMetadata,
                          final SquareRepository squareRepository) {
        undoableDataWrapper = new UndoableCommandDataWrapper();
        undoableDataWrapper.setSquare(square);
        undoableDataWrapper.setCommandMetadata(commandMetadata);
        undoableDataWrapper.setSquareRepository(squareRepository);
    }
}
