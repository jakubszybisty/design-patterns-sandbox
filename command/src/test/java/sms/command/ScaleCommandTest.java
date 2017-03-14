package sms.command;

import org.junit.Test;
import sms.Square;
import sms.SquareRepository;

import static org.junit.Assert.*;

/**
 * Created by jakub on 14.03.2017.
 */
public class ScaleCommandTest {

    private ScaleCommand scaleCommand = new ScaleCommand();

    @Test
    public void shouldExecuteScaleCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        final Square square = new Square();
        square.setNumber(2);
        square.setSideLength(2);
        squareRepository.add(square);
        commandMetadata.setIFactor(2);
        commandMetadata.setJFactor(10);
        scaleCommand.execute(squareRepository, commandMetadata);

        Square scaledSquare = squareRepository.findOneById(2).get();
        assertEquals(2, scaledSquare.getNumber());
        assertEquals(20, scaledSquare.getSideLength());
    }

    @Test
    public void shouldUndoScaleCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        final Square square = new Square();
        square.setNumber(2);
        square.setSideLength(2);
        squareRepository.add(square);
        commandMetadata.setIFactor(2);
        commandMetadata.setJFactor(10);
        scaleCommand.execute(squareRepository, commandMetadata);
        scaleCommand.undo();

        Square scaledSquare = squareRepository.findOneById(2).get();
        assertEquals(2, scaledSquare.getNumber());
        assertEquals(2, scaledSquare.getSideLength());
    }

    @Test
    public void shouldRedoScaleCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        final Square square = new Square();
        square.setNumber(2);
        square.setSideLength(2);
        squareRepository.add(square);
        commandMetadata.setIFactor(2);
        commandMetadata.setJFactor(10);
        scaleCommand.execute(squareRepository, commandMetadata);
        scaleCommand.undo();
        scaleCommand.redo();

        Square scaledSquare = squareRepository.findOneById(2).get();
        assertEquals(2, scaledSquare.getNumber());
        assertEquals(20, scaledSquare.getSideLength());
    }

}