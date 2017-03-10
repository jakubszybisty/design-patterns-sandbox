package sms.command;

/**
 * Created by jakub on 07.03.2017.
 */
public class CommandMetadataResolver {

    private static final String SPACE_REGEXP = "\\s+";

    public CommandMetadata resolve(String input) {
        final CommandMetadata commandMetadata = new CommandMetadata();
        String parameters[] = input.split(SPACE_REGEXP);
        final CommandShortcut shortcut = CommandShortcut.valueOf(parameters[0]);
        commandMetadata.setCommandShortcut(shortcut);

        switch(shortcut) {
            case C:
            case S:
                commandMetadata.setIFactor(Integer.valueOf(parameters[1]));
                commandMetadata.setJFactor(Integer.valueOf(parameters[2]));
                break;
            case M:
                commandMetadata.setIFactor(Integer.valueOf(parameters[1]));
                commandMetadata.setJFactor(Integer.valueOf(parameters[2]));
                commandMetadata.setKFactor(Integer.valueOf(parameters[3]));
                break;
            case U:
            case R:
            case P:
                break;
        }
        return commandMetadata;
    }
}
