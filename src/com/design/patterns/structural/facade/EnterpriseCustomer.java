package com.design.patterns.structural.facade;

public class EnterpriseCustomer implements ElectricityBill{
    @Override
    public double calculateBill(int units) {
        return units * 10.0;
    }
}
