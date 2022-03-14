package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Implement a simple bank app
        //a. Create Person class with the following attributes (String firstName, String lastName).
        // Write constructor, toString and getters methods.
        Person p = new Person("Ivan", "Ivanov");
        System.out.println(p);
        //b. Create Account class with the following attributes String IBAN, Person client, double balance.
        // Write constructor, toString and getters methods.
        Account account = new Account("DE48127635265171", p, 35847.8);
        System.out.println(account);
        //c. Create BankProcessing class with an attribute Account[] bankAccounts. Write a constructor,
        // which takes an array of Accounts as argument. Write toString method. Write the method witch
        // return the array of all of the bank clients.
        Account[] accounts = new Account[]{account,
                new Account("DE4812723623827961",new Person("Petr", "Petrov"), 24.5),
                new Account("DE4823871393229332",new Person("Karl", "Karlov"), 23453)};
        BankProcessing bp = new BankProcessing(accounts);
        System.out.println(bp);
        System.out.println(Arrays.toString(bp.getClients(accounts)));
        //d. In the Account class write secureToString method which works like normal toString but instead
        // IBAN put in the result string something like DE45 *********35 (replaces all characters
        // of IBAN string to char ‘’ except four first and two last characters).
        System.out.println(account.secureToString());

        //e. In the BankProcessing implement the secureToString method which displays the accounts using
        // Account.secureToString method.
        System.out.println(bp.secureToString());

        //f. In the BankProcessing implement the method which returns the sum of all accounts balances.
        System.out.println("Sum of balances = " + bp.getSumBalances(accounts));
    }
}
