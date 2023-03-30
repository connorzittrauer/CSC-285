/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: GarageUpCommand.java
 */

/* This class implements the ICommand interface and provides methods for
 * managing the garage door's state through the ICommand's methods
 */

package Commands;
import Interfaces.ICommand;
import Objects.GarageDoor;

public class GarageUpCommand implements ICommand {
    GarageDoor garageDoor;

    public GarageUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.doorUp();
    }

    @Override
    public void undo() {
        garageDoor.doorDown();
    }

    @Override
    public String toString() {
        return "Garage Up";
    }
}
