/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: ProjectName
 *  File Name: FileName.java
 */

/* Class Description */

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
