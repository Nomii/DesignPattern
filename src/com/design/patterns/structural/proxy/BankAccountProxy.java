package com.design.patterns.structural.proxy;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private String authorizedUser;

    public BankAccountProxy(String user, double initialBalance) {
        this.realAccount = new RealBankAccount(initialBalance);
        this.authorizedUser = user;
    }

    @Override
    public void withdraw(String user, double amount) {
        if (user.equals(authorizedUser)) {
            realAccount.withdraw(user, amount);
        } else {
            System.out.println("Access denied: " + user + " is not authorized to withdraw.");
        }
    }
}