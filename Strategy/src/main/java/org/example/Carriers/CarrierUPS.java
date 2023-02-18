/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Strategy Pattern
 *  File Name: CarrierUPS.java
 */

/* Provides a concrete implementation of the Shipment class */

package org.example.Carriers;

import org.example.Formats.WriteFile;
import org.example.Shipment;

public class CarrierUPS extends Shipment
{
    public CarrierUPS() {
        this.setWriteable(new WriteFile("UPS"));
    }
}
