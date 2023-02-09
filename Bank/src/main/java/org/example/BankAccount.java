/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Bank
 *  File Name: Bank.java
 */

/*  This program provides a simple mock bank account system with
 *  the ability to create a new bank account, find a specific account
 *  and list its balance, and deposit and withdraw money.
 *
 *  It does not handle erroneous input and will crash on bad input.
*/

package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccount
{
    public static void main(String[] args)
    {
        HashMap<Integer, Double> accounts = new HashMap<>();
        String selection = "";
        Double cashAmount;
        Integer accountNo;
        int count = 0;

        System.out.println("Welcome to your Banking System");
        System.out.println("Press 'Q' to quit at any time \n");

        while (!selection.equalsIgnoreCase("q"))
        {
            System.out.println("Option 1. Add Account");
            System.out.println("Option 2. Find Account");
            System.out.println("Option 3. Deposit Money");
            System.out.println("Option 4. Withdraw Money ");
            selection = userInput();

            switch (selection)
            {
                // Creates a new account
                case "1" ->
                {
                    accounts.put(count += 1, 0.00);
                    prettyPrintHashMap(accounts);
                }
                // Finds specific bank account and prints balance
                case "2" ->
                {
                    System.out.println("Enter your account number");
                    // find account by key
                    accountNo = Integer.parseInt(userInput());
                    prettyPrintHashMap(accounts, accountNo);
                }
                case "3" ->
                {
                    System.out.println("Enter your account number");
                    accountNo = Integer.parseInt(userInput());

                    System.out.println("Deposit Amount");
                    cashAmount = Double.parseDouble(userInput());

                    // find account by key and insert deposit value into hashmap value
                    accounts.put(accountNo, accounts.get(accountNo) + cashAmount);
                }
                case "4" ->
                {
                    System.out.println("Enter your account number");
                    accountNo = Integer.parseInt(userInput());

                    System.out.println("Withdrawal Amount");
                    cashAmount = Double.parseDouble(userInput());

                    // find account by key and insert withdraw value into hashmap value
                    accounts.put(accountNo, accounts.get(accountNo) - cashAmount);

                }
            }
        }
    }

    /*  The following two methods below have been overloaded.
     *  The first method prints out every account while the
     *  second method prints out a specific account given
     *  a Hashmap key.
     */
    public static void prettyPrintHashMap(HashMap<Integer, Double> accounts)
    {
        System.out.println("----------------------");
        accounts.forEach((key, value) ->
                System.out.println("Acct. NO: " + key + "\n" + String.format("Balance: $%,02.2f", value)));
        System.out.println("----------------------");
    }

    public static void prettyPrintHashMap(HashMap<Integer, Double> account, Integer key)
    {
        for (Map.Entry<Integer, Double> entry : account.entrySet())
        {
            if (entry.getKey().equals(key))
            {
                System.out.println("----------------------");
                System.out.println("Acct. NO: " + entry.getKey() + "\n" +
                        String.format("Balance: $%,02.2f", entry.getValue()));
                System.out.println("----------------------");
            }
        }
    }

    // This method provides a mock terminal console input.
    public static String userInput()
    {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.print("> ");
        input = scanner.nextLine();
        return input;
    }
}