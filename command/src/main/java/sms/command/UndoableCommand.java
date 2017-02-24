package sms.command;

import sms.Board;

/**
 * Created by jszybisty on 2/24/2017.
 */
public interface UndoableCommand {
    void execute(Board board, String commandMetaData);

    CommandMetadata extractCommandInformation(String input);
}
