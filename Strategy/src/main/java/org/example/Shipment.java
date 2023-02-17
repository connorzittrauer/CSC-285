/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: ProjectName
 *  File Name: FileName.java
 */

/* Class Description */

package org.example;

public abstract class Shipment
{
    private IWriteable writeable;

    public void setWriteable(IWriteable writeable) {
        this.writeable = writeable;
    }

    public void writeToFile(){
        writeable.writeToFile();
    }
}
