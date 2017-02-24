package sms.command;

/**
 * Created by jszybisty on 2/24/2017.
 */
public enum CommandShortcut {
    C("create"),
    M("move"),
    S("scale"),
    U("undo"),
    R("redo"),
    P("print");

    private String command;

    CommandShortcut(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "sms.command.CommandShortcut{" +
                "command='" + command + '\'' +
                '}';
    }
}