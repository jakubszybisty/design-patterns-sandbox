package sms.command;

import sms.Square;
import sms.SquareRepository;

import java.util.Optional;

/**
 * Created by jakub on 09.03.2017.
 */
public class MoveCommand extends Command {

    @Override
    public void execute(final SquareRepository squareRepository, final CommandMetadata commandMetadata) {
        final Optional<Square> square = squareRepository.findOneById(commandMetadata.getIFactor());
        square.ifPresent(s -> {
            moveSquareForward(s, commandMetadata);
            saveUndoableData(s, commandMetadata,null);
        });
    }

    @Override
    public void undo() {
        moveSquareBackward(undoableDataWrapper.getSquare(), undoableDataWrapper.getCommandMetadata());
    }

    @Override
    public void redo() {
        moveSquareForward(undoableDataWrapper.getSquare(), undoableDataWrapper.getCommandMetadata());
    }

    private static void moveSquareForward(final Square square, final CommandMetadata commandMetadata) {
        square.setXCoordinate(square.getXCoordinate() + commandMetadata.getJFactor());
        square.setYCoordinate(square.getYCoordinate() + commandMetadata.getKFactor());
}

    private static void moveSquareBackward(final Square square, final CommandMetadata commandMetadata) {
        square.setXCoordinate(square.getXCoordinate() - commandMetadata.getJFactor());
        square.setYCoordinate(square.getYCoordinate() - commandMetadata.getKFactor());
    }
}
