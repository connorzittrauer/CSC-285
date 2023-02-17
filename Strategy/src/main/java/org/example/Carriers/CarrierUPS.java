/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: ProjectName
 *  File Name: FileName.java
 */

/* Class Description */

package org.example.Carriers;

import org.example.Formats.WriteFile;
import org.example.Shipment;

public class CarrierUPS extends Shipment
{
    public CarrierUPS() {
        this.setWriteable(new WriteFile("UPS"));
    }
}
