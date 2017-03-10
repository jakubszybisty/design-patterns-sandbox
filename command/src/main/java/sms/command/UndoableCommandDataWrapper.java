package sms.command;

import sms.Square;
import sms.SquareRepository;

/**
 * Created by jakub on 10.03.2017.
 */
public class UndoableCommandDataWrapper {

    private Square square;
    private CommandMetadata commandMetadata;
    private SquareRepository squareRepository;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public CommandMetadata getCommandMetadata() {
        return commandMetadata;
    }

    public void setCommandMetadata(CommandMetadata commandMetadata) {
        this.commandMetadata = commandMetadata;
    }

    public SquareRepository getSquareRepository() {
        return squareRepository;
    }

    public void setSquareRepository(SquareRepository squareRepository) {
        this.squareRepository = squareRepository;
    }
}
