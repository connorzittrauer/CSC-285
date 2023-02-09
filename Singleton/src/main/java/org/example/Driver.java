/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Singleton
 *  File Name: Driver.java
 */

/* This is the driver class for the Singleton design pattern. */

package org.example;

public class Driver
{
    public static void main(String[] args)
    {
        AccountNumberGenerator accountNumberGenerator = AccountNumberGenerator.getInstance();

        // Verifies the getNextNumber method
        for (int i = 0; i <= 15; i++)
        {
            System.out.print(accountNumberGenerator.getNextNumber() + " ");
        }
    }
}