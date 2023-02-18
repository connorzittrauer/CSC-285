/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Strategy Pattern
 *  File Name: Shipment.java
 */

/* Abstract class that provides a level of abstraction for the concrete carrier implementations.
 * This class uses polymorphism to guarantee that all concrete instantiations will have its methods.
 */

package org.example;

public abstract class Shipment
{
    private IWriteable writeable;

    /* This method defines the behavior of the writeToFileMethod() on an instance of a carrier class.
    *  There are two behaviors: CSV and WriteFile.
    */
    public void setWriteable(IWriteable writeable) {
        this.writeable = writeable;
    }

    public void writeToFile(){
        writeable.writeToFile();
    }
}
