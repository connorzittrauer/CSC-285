/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: Main.java
 */

/* This is the driver class for the CommandPattern project.
 * It creates multiple controllers and executes and undoes the command actions.
 */

import Commands.GarageDownCommand;
import Commands.GarageUpCommand;
import Commands.LightOffCommand;
import Commands.LightOnCommand;
import Interfaces.ICommand;
import Objects.*;

public class Main {
    public static void main(String[] args) {
        // Create a universal remote
        RemoteControl control = new RemoteControl(5);

        // Create a light
        Light livingRoomLight = new Light("Living Room Light");
        ICommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        ICommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        //switch light on
        control.setCommand(0, livingRoomLightOn);
        control.pressButton(0);

        //switch light off
        control.setCommand(1, livingRoomLightOff);
        control.pressButton(1);

        // Create a garage door
        GarageDoor garageDoor = new GarageDoor();
        ICommand garageDownCommand = new GarageDownCommand(garageDoor);
        ICommand garageUpCommand = new GarageUpCommand(garageDoor);

        control.setCommand(2, garageDownCommand);
        control.pressButton(2);

        control.setCommand(3, garageUpCommand);
        control.pressButton(3);

        // Undo until we hit an error, and handle it
        control.undo();
        control.undo();
        control.undo();
        control.undo();
        control.undo();


    }
}