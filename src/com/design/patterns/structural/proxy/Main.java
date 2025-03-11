package com.design.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccountProxy("Alice", 1000);

        myAccount.withdraw("Alice", 200);  // Allowed
        myAccount.withdraw("Bob", 100);    // Access Denied
        myAccount.withdraw("Alice", 900);  // Insufficient funds
    }
}
