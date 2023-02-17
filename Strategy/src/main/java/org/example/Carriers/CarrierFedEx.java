/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: ProjectName
 *  File Name: FileName.java
 */

/* Class Description */

package org.example.Carriers;

import org.example.Formats.WriteFile;
import org.example.Shipment;

public class CarrierFedEx extends Shipment
{
    public CarrierFedEx(){
        this.setWriteable(new WriteFile("FedEX"));
    }
}
