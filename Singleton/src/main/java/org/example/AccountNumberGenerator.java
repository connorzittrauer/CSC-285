package org.example;
public class AccountNumberGenerator
{
    private static AccountNumberGenerator accountNumberGeneratorInstance;
    private int accountNo = 0;
    private AccountNumberGenerator() {}

    /*
     * Returns an instance of this class.
     * Provides Lazy-loading so that an instance
     * is only instantiated if there isn't already
     * an existing instance.
     */
    public static AccountNumberGenerator getInstance() {
        if (accountNumberGeneratorInstance == null) {
            accountNumberGeneratorInstance = new AccountNumberGenerator();
        }
        return accountNumberGeneratorInstance;
    }
    /*
    * This method increments the accountNo variable
    * by one on each call. It is marked as 'synchronized'
    * so that one thread at a time can execute this method
    */
    public synchronized int getNextNumber() {
        return accountNo++;
    }
}
