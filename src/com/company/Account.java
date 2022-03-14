package com.company;

public class Account {
    //b. Create Account class with the following attributes String IBAN, Person client, double balance.
    // Write constructor, toString and getters methods.
    private String IBAN;
    private Person client;
    private double balance;

    public Account(String IBAN, Person client, double balance) {
        this.IBAN = IBAN;
        this.client = client;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "IBAN=" + IBAN +
                ", client=" + client +
                ", balance=" + balance ;
    }

    //d. In the Account class write secureToString method which works like normal toString but instead
    // IBAN put in the result string something like DE45 *********35 (replaces all characters
    // of IBAN string to char ‘’ except four first and two last characters).
    public String secureToString() {
        String secureIBAN="";
        for (int i = 0; i < IBAN.length(); i++) {
            if (i<=3 || i>=IBAN.length()-2)
                secureIBAN += IBAN.charAt(i);
            else secureIBAN += '*';
        }
        return "IBAN=" + secureIBAN +
                ", client=" + client +
                ", balance=" + balance ;
    }

}
