package com.design.patterns.structural.facade;

public class BillingFacade {
    public static double generateBill(String customerType, int units) {
        ElectricityBill bill;

        switch (customerType.toLowerCase()) {
            case "domestic":
                bill = new DomesticCustomer();
                break;
            case "business":
                bill = new BusinessCustomer();
                break;
            case "enterprise":
                bill = new EnterpriseCustomer();
                break;
            default:
                throw new IllegalArgumentException("Invalid customer type");
        }

        return bill.calculateBill(units);
    }
}

