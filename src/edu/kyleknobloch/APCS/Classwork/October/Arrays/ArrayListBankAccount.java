package edu.kyleknobloch.APCS.Classwork.October.Arrays;

import java.util.ArrayList;


public class ArrayListBankAccount {
    public static void main(String[] args) {

        // Create an ArrayList to hold BankAccount objects.
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();

        // Add three BankAccount objects to the ArrayList.
        list.add(new BankAccount(100000.0));
        list.add(new BankAccount(500000.0));
        list.add(new BankAccount(1500000.0));

        // Display each item.
        for (int index = 0; index < list.size(); index++) {
            BankAccount account = list.get(index);
            System.out.println("Account at index " + index + "\nBalance: " + account.getBalance());
        }

    }
}

