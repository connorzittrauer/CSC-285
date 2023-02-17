/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: ProjectName
 *  File Name: FileName.java
 */

/* Class Description */

package org.example;

import org.example.Carriers.CarrierBigBobs;
import org.example.Carriers.CarrierDHL;
import org.example.Carriers.CarrierFedEx;
import org.example.Carriers.CarrierUPS;
import org.example.Formats.CSV;
import org.example.Formats.WriteFile;

public class Driver
{
    public static void main(String[] args)
    {
        Shipment ups = new CarrierUPS();
        Shipment fedEX = new CarrierFedEx();
        Shipment DHL = new CarrierDHL();
        Shipment bobs = new CarrierBigBobs();

        ups.writeToFile();
        fedEX.writeToFile();
        DHL.writeToFile();
        bobs.writeToFile();

        // Modifies behavior of FedEX strategy
        CSV csv = new CSV("FedEX");
        fedEX.setWriteable(csv);
        fedEX.writeToFile();

    }
}