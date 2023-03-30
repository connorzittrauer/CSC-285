package Interfaces;/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: Interfaces.ICommand.java
 */

/* This interface provides a layer of abstraction for the command to concretely implement */

public interface ICommand {
    void execute();

    void undo();
}
