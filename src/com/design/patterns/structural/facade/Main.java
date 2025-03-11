package com.design.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        int units = 100;

        System.out.println("Domestic Customer Bill: Rs. " + BillingFacade.generateBill("domestic", units));
        System.out.println("Business Customer Bill: Rs. " + BillingFacade.generateBill("business", units));
        System.out.println("Enterprise Customer Bill: Rs. " + BillingFacade.generateBill("enterprise", units));
    }
}

