/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Strategy Pattern
 *  File Name: CarrierFedEx.java
 */

/* Provides a concrete implementation of the Shipment class */

package org.example.Carriers;

import org.example.Formats.WriteFile;
import org.example.Shipment;

public class CarrierFedEx extends Shipment
{
    public CarrierFedEx(){
        this.setWriteable(new WriteFile("FedEX"));
    }
}
