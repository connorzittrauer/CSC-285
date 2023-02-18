/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Strategy Pattern
 *  File Name: CarrierBigBobs.java
 */

/* Provides a concrete implementation of the Shipment class */

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
