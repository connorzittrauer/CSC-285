/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Strategy Pattern
 *  File Name: CSV.java
 */

/* This a behavioral class that implements the IWriteable interface. It provides
 * a concrete implementation of the writeToFile() method for writing to a CSV file.
 */
package org.example.Formats;

import org.example.IWriteable;

public class CSV implements IWriteable
{
    String carrierName;

    public CSV(String carrierName) {
        this.carrierName = carrierName;
    }
    @Override
    public void writeToFile()
    {
        System.out.println("Write a generic csv file for " + carrierName + " co.");
    }
}
