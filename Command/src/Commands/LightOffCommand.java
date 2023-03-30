/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: LightOffCommand.java
 */

/* This class implements the ICommand interface and provides methods for
 * managing the Light's state through the ICommand's methods
 */

package Commands;
import Objects.Light;
import Interfaces.ICommand;

public class LightOffCommand implements ICommand {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }

    @Override
    public String toString() {
        return "Light Off";
    }

}