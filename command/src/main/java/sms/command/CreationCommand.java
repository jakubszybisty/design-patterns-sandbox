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
        Square square = buildSquare(commandMetadata);
        Optional<Square> optionalSquare = squareRepository.findOne(square);
        optionalSquare.ifPresent(s -> squareRepository.remove(s));
        squareRepository.add(square);
        saveUndoableData(square, commandMetadata, squareRepository);
    }

    @Override
    public void undo() {
        Optional<Square> square = undoableDataWrapper.getSquareRepository().findOne(undoableDataWrapper.getSquare());
        square.ifPresent(s -> undoableDataWrapper.getSquareRepository().remove(s));
    }

    @Override
    //mozna prosciej
    public void redo() {
        execute(undoableDataWrapper.getSquareRepository(), undoableDataWrapper.getCommandMetadata());
    }

    private static Square buildSquare(final CommandMetadata commandMetadata) {
        Square square = new Square();
        square.setNumber(commandMetadata.getIFactor());
        square.setSideLength(commandMetadata.getJFactor());
        return square;
    }
}
