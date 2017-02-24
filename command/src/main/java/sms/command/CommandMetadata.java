package sms.command;

/**
 * Created by jszybisty on 2/24/2017.
 */
public class CommandMetadata {
    private CommandShortcut commandShortcut;
    private int squareNumber;
    private int jFactor;
    private int kFactor;

    public CommandShortcut getCommandShortcut() {
        return commandShortcut;
    }

    public void setCommandShortcut(CommandShortcut commandShortcut) {
        this.commandShortcut = commandShortcut;
    }

    public int getSquareNumber() {
        return squareNumber;
    }

    public void setSquareNumber(int squareNumber) {
        this.squareNumber = squareNumber;
    }

    public int getjFactor() {
        return jFactor;
    }

    public void setjFactor(int jFactor) {
        this.jFactor = jFactor;
    }

    public int getkFactor() {
        return kFactor;
    }

    public void setkFactor(int kFactor) {
        this.kFactor = kFactor;
    }

    @Override
    public String toString() {
        return "sms.command.CommandMetadata{" +
                "commandShortcut=" + commandShortcut +
                ", squareNumber=" + squareNumber +
                ", jFactor=" + jFactor +
                ", kFactor=" + kFactor +
                '}';
    }
}
