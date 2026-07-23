package com.constructor;

public class BankProcessor {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, "Alice", 10000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: $" + account.getBalance());

        
        account.deposit(5000);

      
        account.withdraw(3000);

        System.out.println("\nUpdated Balance: $" + account.getBalance());
    }
}