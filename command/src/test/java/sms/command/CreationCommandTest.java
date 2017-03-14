package sms.command;

import org.junit.Test;
import sms.SquareRepository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jakub on 14.03.2017.
 */
public class CreationCommandTest {

    private CreationCommand creationCommand = new CreationCommand();

    @Test
    public void shouldExecuteCreationCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        commandMetadata.setIFactor(1);
        commandMetadata.setJFactor(1);
        creationCommand.execute(squareRepository, commandMetadata);
        assertEquals(1, squareRepository.findAll().size());
    }

    @Test
    public void shouldUndoCreationCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        commandMetadata.setIFactor(1);
        commandMetadata.setJFactor(1);

        creationCommand.execute(squareRepository, commandMetadata);
        creationCommand.undo();
        assertTrue(squareRepository.findAll().isEmpty());
    }

    @Test
    public void shouldRedoCreationCommand() {
        final SquareRepository squareRepository = new SquareRepository();
        final CommandMetadata commandMetadata = new CommandMetadata();
        commandMetadata.setIFactor(1);
        commandMetadata.setJFactor(1);

        creationCommand.execute(squareRepository, commandMetadata);
        creationCommand.undo();
        creationCommand.redo();
        assertEquals(1, squareRepository.findAll().size());
    }
}

