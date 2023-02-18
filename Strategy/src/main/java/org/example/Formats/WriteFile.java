/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Strategy Pattern
 *  File Name: WriteFile.java
 */

/* This a behavioral class that implements the IWriteable interface. It provides
 * a concrete implementation of the writeToFile() method for writing to a generic file.
 */

package org.example.Formats;

import org.example.IWriteable;

public class WriteFile implements IWriteable
{
    String carrierName;

    public WriteFile(String carrierName) {
        this.carrierName = carrierName;
    }
    @Override
    public void writeToFile()
    {
        System.out.println("Write a file properly formatted for " + carrierName + " co.");
    }
}
