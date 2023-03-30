/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: RemoteControl.java
 */

/* This class provides a universal remote controller for
 * executing and undoing commands.
 */

import Interfaces.ICommand;
import java.util.ArrayList;

public class RemoteControl {
    private ICommand[] commands;
    private ArrayList<ICommand> history = new ArrayList<>();

    public RemoteControl(int buttonCount) {
        commands = new ICommand[buttonCount];

    }

    public void setCommand(int button, ICommand command) {
        this.commands[button] = command;

    }

    public void pressButton(int button) {
        commands[button].execute();
        history.add(commands[button]);
    }

    /* Gets the last executed command and removes it.
     *  Handles the error when there are no more items to undo
     *  as the instructions state it should handle an "unlimited number" of undos.
     */
    public void undo() {
        try {
            ICommand lastItem = history.get(history.size() - 1);
            System.out.println("\nUndoing command: " + lastItem);
            history.remove(lastItem);
            lastItem.undo();
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("\nNothing left to undo.");

        }

    }
}
