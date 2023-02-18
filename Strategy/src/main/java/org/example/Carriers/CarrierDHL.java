/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Strategy Pattern
 *  File Name: CarrierDHL.java
 */

/* Provides a concrete implementation of the Shipment class */

package org.example.Carriers;

import org.example.Formats.WriteFile;
import org.example.Shipment;

public class CarrierDHL extends Shipment
{
    public CarrierDHL(){
        this.setWriteable(new WriteFile("DHL"));
    }
}
