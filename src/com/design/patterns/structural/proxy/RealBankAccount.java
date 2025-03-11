package com.design.patterns.structural.proxy;

public class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(String user, double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(user + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(user + " attempted to withdraw $" + amount + " but has insufficient funds.");
        }
    }
}

