package sms.command;

/**
 * Created by jakub on 07.03.2017.
 */
public enum CommandShortcut {
    C("create"),
    M("move"),
    S("scale"),
    U("undo"),
    R("redo"),
    P("print");

    private String name;

    CommandShortcut(String name) {
        this.name = name;
    }
}
