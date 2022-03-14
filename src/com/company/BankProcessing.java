package com.company;

import java.util.Arrays;

public class BankProcessing {
    //c. Create BankProcessing class with an attribute Account[] bankAccounts. Write a constructor,
    // which takes an array of Accounts as argument. Write toString method. Write the method witch
    // return the array of all of the bank clients.
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String toString() {
        return "bankAccounts=" + Arrays.toString(bankAccounts) ;
    }

    public Person[] getClients(Account[] bankAccounts){
        Person[] clients = new Person[bankAccounts.length];
        for (int i = 0; i < clients.length; i++) {
            clients[i] = bankAccounts[i].getClient();
        }
        return clients;
    }
    //e. In the BankProcessing implement the secureToString method which displays the accounts using
    // Account.secureToString method.
    public String secureToString() {
        String s = "";
        for (Account a: bankAccounts) {
            s += a.secureToString() + "; ";
        }
        return s ;
    }

    //f. In the BankProcessing implement the method which returns the sum of all accounts balances.
    public double getSumBalances(Account[] accounts){
        double sum=0;
        for (Account account: accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

}
