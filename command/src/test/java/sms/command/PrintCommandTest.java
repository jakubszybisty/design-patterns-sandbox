package sms.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sms.Square;
import sms.SquareRepository;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by jakub on 14.03.2017.
 */
public class PrintCommandTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintCommand printCommand = new PrintCommand();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void shouldPrintSquares() {
        final SquareRepository squareRepository = new SquareRepository();
        final Square square_1 = new Square();
        square_1.setSideLength(1);
        square_1.setNumber(1);
        square_1.setXCoordinate(10);
        square_1.setYCoordinate(20);
        final Square square_2 = new Square();
        square_2.setSideLength(6);
        square_2.setNumber(2);
        square_2.setXCoordinate(13);
        square_2.setYCoordinate(17);

        squareRepository.add(square_1);
        squareRepository.add(square_2);

        printCommand.execute(squareRepository);
        String consoleOutput = outContent.toString();
        String[] split = consoleOutput.split("\\s+");
        String firstSquareRepresentation = new StringBuilder()
                .append(split[0]).append(" ")
                .append(split[1]).append(" ")
                .append(split[2]).append(" ")
                .append(split[3]).toString();

        String secondSquareRepresentation = new StringBuilder()
                .append(split[4]).append(" ")
                .append(split[5]).append(" ")
                .append(split[6]).append(" ")
                .append(split[7]).toString();
        assertEquals(firstSquareRepresentation, square_1.toString());
        assertEquals(secondSquareRepresentation, square_2.toString());
    }
}