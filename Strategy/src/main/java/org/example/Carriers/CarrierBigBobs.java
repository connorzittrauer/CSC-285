/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: ProjectName
 *  File Name: FileName.java
 */

/* Class Description */

package org.example.Carriers;
import org.example.Formats.CSV;
import org.example.Shipment;

public class CarrierBigBobs extends Shipment
{
    public CarrierBigBobs()
    {
        this.setWriteable(new CSV("Big Bobs"));
    }
}
