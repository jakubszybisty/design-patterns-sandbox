package sms.command;

import sms.Board;
import sms.Square;

import java.util.Map;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class ScaleCommand implements UndoableCommand {

    @Override
    public void execute(Board board) {

    }

    @Override
    public CommandMetadata extractCommandInformation(String input) {
        return null;
    }
}
