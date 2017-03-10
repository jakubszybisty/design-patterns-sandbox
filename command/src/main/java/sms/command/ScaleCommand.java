package sms.command;

import sms.Square;
import sms.SquareRepository;

import java.util.Optional;

/**
 * Created by jakub on 10.03.2017.
 */
public class ScaleCommand extends Command {

    @Override
    public void execute(final SquareRepository squareRepository, final CommandMetadata commandMetadata) {
        final Optional<Square> square = squareRepository.findOneById(commandMetadata.getIFactor());
        square.ifPresent(s -> {
            scaleSquare(s, commandMetadata);
            saveUndoableData(s, commandMetadata, null);
        });
    }

    @Override
    public void undo() {
        reduceSquare(undoableDataWrapper.getSquare(), undoableDataWrapper.getCommandMetadata());
    }

    @Override
    public void redo() {
        scaleSquare(undoableDataWrapper.getSquare(), undoableDataWrapper.getCommandMetadata());
    }

    private static void scaleSquare(final Square square, final CommandMetadata commandMetadata) {
        square.setSideLength(square.getSideLength() * commandMetadata.getJFactor());
    }

    private static void reduceSquare(final Square square, final CommandMetadata commandMetadata) {
        square.setSideLength(square.getSideLength() / commandMetadata.getJFactor());
    }
}
