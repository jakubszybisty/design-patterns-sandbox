package sms.command;

import org.junit.Test;
import sms.Square;
import sms.SquareRepository;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by jakub on 14.03.2017.
 */
public class MoveCommandTest {

    private MoveCommand moveCommand = new MoveCommand();

    @Test
    public void shouldExecuteMoveCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        final Square square = new Square();
        square.setNumber(1);
        squareRepository.add(square);
        commandMetadata.setIFactor(1);
        commandMetadata.setJFactor(2);
        commandMetadata.setKFactor(5);
        moveCommand.execute(squareRepository, commandMetadata);

        Square movedSquare = squareRepository.findOneById(1).get();
        assertEquals(1, movedSquare.getNumber());
        assertEquals(2, movedSquare.getXCoordinate());
        assertEquals(5, movedSquare.getYCoordinate());
    }

    @Test
    public void shouldUndoMoveCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        final Square square = new Square();
        square.setNumber(1);
        squareRepository.add(square);
        commandMetadata.setIFactor(1);
        commandMetadata.setJFactor(2);
        commandMetadata.setKFactor(5);
        moveCommand.execute(squareRepository, commandMetadata);
        moveCommand.undo();

        Square movedSquare = squareRepository.findOneById(1).get();
        assertEquals(1, movedSquare.getNumber());
        assertEquals(0, movedSquare.getXCoordinate());
        assertEquals(0, movedSquare.getYCoordinate());
    }

    @Test
    public void shouldRedoMoveCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        final Square square = new Square();
        square.setNumber(1);
        squareRepository.add(square);
        commandMetadata.setIFactor(1);
        commandMetadata.setJFactor(2);
        commandMetadata.setKFactor(5);
        moveCommand.execute(squareRepository, commandMetadata);
        moveCommand.undo();
        moveCommand.redo();

        Square movedSquare = squareRepository.findOneById(1).get();
        assertEquals(1, movedSquare.getNumber());
        assertEquals(2, movedSquare.getXCoordinate());
        assertEquals(5, movedSquare.getYCoordinate());
    }
}