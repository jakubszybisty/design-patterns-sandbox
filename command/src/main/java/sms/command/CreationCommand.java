package sms.command;

import sms.SquareRepository;
import sms.Square;

import java.util.Optional;

/**
 * Created by jakub on 26.02.2017.
 */
public class CreationCommand extends Command {

    @Override
    public void execute(final SquareRepository squareRepository, final CommandMetadata commandMetadata) {
        final Square square = buildSquare(commandMetadata);
        final Optional<Square> optionalSquare = squareRepository.findOneById(square.getNumber());
        optionalSquare.ifPresent(s -> squareRepository.remove(s));
        squareRepository.add(square);
        saveUndoableData(square, commandMetadata, squareRepository);
    }

    @Override
    public void undo() {
        final Optional<Square> square = undoableDataWrapper.getSquareRepository().findOneById(undoableDataWrapper.getSquare().getNumber());
        square.ifPresent(s -> undoableDataWrapper.getSquareRepository().remove(s));
    }

    @Override
    public void redo() {
        undoableDataWrapper.getSquareRepository().add(undoableDataWrapper.getSquare());
    }

    private static Square buildSquare(final CommandMetadata commandMetadata) {
        final Square square = new Square();
        square.setNumber(commandMetadata.getIFactor());
        square.setSideLength(commandMetadata.getJFactor());
        return square;
    }
}
