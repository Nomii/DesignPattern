package com.design.patterns.structural.facade;

public class BusinessCustomer implements ElectricityBill {
    @Override
    public double calculateBill(int units) {
        return units * 15.0;
    }
}
