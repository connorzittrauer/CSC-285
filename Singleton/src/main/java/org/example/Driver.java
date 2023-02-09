package org.example;
// a change
public class Driver
{
    public static void main(String[] args)
    {
        AccountNumberGenerator accountNumberGenerator = AccountNumberGenerator.getInstance();

        // Verifies the getNextNumber Method
        for (int i = 0; i <= 15; i++) {
            System.out.print(accountNumberGenerator.getNextNumber() + " ");
        }

    }
}