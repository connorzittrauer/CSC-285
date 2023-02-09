/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Singleton
 *  File Name: AccountNumberGenerator.java
 */

/* This class implements the Singleton pattern.
 * It can only return at most a single instance of the class,
 * thus adhering to the Singleton principle. The purpose of this
 * class is to return a new account number on each call of its instance.
 */

package org.example;

public class AccountNumberGenerator
{
    private static AccountNumberGenerator accountNumberGeneratorInstance;
    private int accountNo = 0;

   /*
    * Private constructor so that multiple instances of the class cannot be
    * instantiated outside the class.
    */
    private AccountNumberGenerator() {}

   /*
    * Returns an instance of this class. Provides Lazy-loading so that an instance
    * is only instantiated if there isn't already an existing instance. If there is already
    * an existing instance, then that instance is returned.
    */
    public static AccountNumberGenerator getInstance()
    {
        if (accountNumberGeneratorInstance == null)
        {
            accountNumberGeneratorInstance = new AccountNumberGenerator();
        }
        return accountNumberGeneratorInstance;
    }

   /*
    * This method increments the accountNo variable by one on each call.
    * It is marked as 'synchronized' so that only one thread at a time can execute this method.
    */
    public synchronized int getNextNumber() { return accountNo++; }
}
