package sms.command;

/**
 * Created by jakub on 27.02.2017.
 */
public class CommandMetadata {
    private CommandShortcut commandShortcut;
    private int iFactor;
    private int jFactor;
    private int kFactor;

    public CommandShortcut getCommandShortcut() {
        return commandShortcut;
    }

    public void setCommandShortcut(CommandShortcut commandShortcut) {
        this.commandShortcut = commandShortcut;
    }

    public int getIFactor() {
        return iFactor;
    }

    public void setIFactor(int iFactor) {
        this.iFactor = iFactor;
    }

    public int getJFactor() {
        return jFactor;
    }

    public void setJFactor(int jFactor) {
        this.jFactor = jFactor;
    }

    public int getKFactor() {
        return kFactor;
    }

    public void setKFactor(int kFactor) {
        this.kFactor = kFactor;
    }
}
