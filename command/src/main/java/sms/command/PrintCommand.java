package sms.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sms.Board;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class PrintCommand {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintCommand.class);

    public void execute(Board board) {
        board.getSquares().forEach(s -> LOGGER.info(String.format("%d %d %d %d", s.getNumber(), s.getxCord(), s.getyCord(), s.getSideLength())));
    }
}
