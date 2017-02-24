package sms;

import sms.command.UndoableCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class Invoker {
    private List<UndoableCommand> commands = new ArrayList();

    public void invoke(UndoableCommand undoableCommand, String commandMetadata, Board board) {
        undoableCommand.execute(input, commandMetadata);
    }

    public void undo() {

    }

    public void redo() {

    }


}
