package sms.command;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by jakub on 13.03.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class CommandMetadataResolverTest {

    private static final String CREATE_INPUT = "C 1 1";
    private static final String SCALE_INPUT = "S 2 10";
    private static final String MOVE_INPUT = "M 3 4 5";
    private static final String UNDO_INPUT =  "U";
    private static final String REDO_INPUT =  "R";
    private static final String PRINT_INPUT =  "P";

    private CommandMetadataResolver resolver = new CommandMetadataResolver();

    @Test
    public void shouldResolveCreateCommand() {
        final CommandMetadata commandMetadata = resolver.resolve(CREATE_INPUT);
        assertEquals(CommandShortcut.C, commandMetadata.getCommandShortcut());
        assertEquals(1, commandMetadata.getIFactor());
        assertEquals(1, commandMetadata.getJFactor());
    }

    @Test
    public void shouldResolveScaleCommand() {
        final CommandMetadata commandMetadata = resolver.resolve(SCALE_INPUT);
        assertEquals(CommandShortcut.S, commandMetadata.getCommandShortcut());
        assertEquals(2, commandMetadata.getIFactor());
        assertEquals(10, commandMetadata.getJFactor());
    }


    @Test
    public void shouldResolveMoveCommand() {
        final CommandMetadata commandMetadata = resolver.resolve(MOVE_INPUT);
        assertEquals(CommandShortcut.M, commandMetadata.getCommandShortcut());
        assertEquals(3, commandMetadata.getIFactor());
        assertEquals(4, commandMetadata.getJFactor());
        assertEquals(5, commandMetadata.getKFactor());
    }

    @Test
    public void shouldResolveUndoCommand() {
        final CommandMetadata commandMetadata = resolver.resolve(UNDO_INPUT);
        assertEquals(CommandShortcut.U, commandMetadata.getCommandShortcut());
    }

    @Test
    public void shouldResolveRedoCommand() {
        final CommandMetadata commandMetadata = resolver.resolve(REDO_INPUT);
        assertEquals(CommandShortcut.R, commandMetadata.getCommandShortcut());
    }

    @Test
    public void shouldResolvePrintCommand() {
        final CommandMetadata commandMetadata = resolver.resolve(PRINT_INPUT);
        assertEquals(CommandShortcut.P, commandMetadata.getCommandShortcut());
    }
}
