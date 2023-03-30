/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: GarageDownCommand.java
 */

/* This class implements the ICommand interface and provides methods for
 * managing the garage door's state through the ICommand's methods
 */

package Commands;
import Interfaces.ICommand;
import Objects.GarageDoor;

public class GarageDownCommand implements ICommand {
    GarageDoor garageDoor;

    public GarageDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.doorDown();
    }

    @Override
    public void undo() {
        garageDoor.doorUp();
    }

    @Override
    public String toString() {
        return "Garage Down";
    }
}
