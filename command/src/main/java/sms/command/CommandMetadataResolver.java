package sms.command;

import java.util.Arrays;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class CommandMetadataResolver {
    private static final String SPACE_REGEXP = "\\s+";

    public CommandMetadata resolve(String input) {
        String parameters[] = Arrays.copyOf(input.split(SPACE_REGEXP), 4);
        CommandMetadata commandMetadata = new CommandMetadata();
        CommandShortcut shortcut = CommandShortcut.valueOf(parameters[0]);
        commandMetadata.setCommandShortcut(shortcut);

        switch (shortcut) {
            case C:
            case S:
                commandMetadata.setSquareNumber(Integer.parseInt(parameters[1]));
                commandMetadata.setjFactor(Integer.parseInt(parameters[2]));
                break;
            case M:
                commandMetadata.setSquareNumber(Integer.parseInt(parameters[1]));
                commandMetadata.setjFactor(Integer.parseInt(parameters[2]));
                commandMetadata.setkFactor(Integer.parseInt(parameters[3]));
                break;
        }
        return commandMetadata;
    }
}
