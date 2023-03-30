/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: LightOnCommand.java
 */

/* This class implements the ICommand interface and provides methods for
 * managing the Light's state through the ICommand's methods
 */

package Commands;
import Objects.Light;
import Interfaces.ICommand;

public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }

    @Override
    public String toString() {
        return "Light On";
    }

}
