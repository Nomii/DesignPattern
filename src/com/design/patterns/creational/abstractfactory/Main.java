package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.concreteimpl.FeeCalculator;
import com.design.patterns.creational.abstractfactory.mainfactory.UniversityFactory;

public class Main {
    public static void main(String[] args) {
        int examScore = 125;
        UniversityFactory universityFactory = UniversityFactory.getUniversityFactory(examScore);
        FeeCalculator feeCalculator = universityFactory.getFeeCalculator("Math");
        System.out.println(feeCalculator.calculateFee());

        FeeCalculator feeCalculator1 = universityFactory.getFeeCalculator("Physics");
        System.out.println(feeCalculator1.calculateFee());

        FeeCalculator feeCalculator2 = universityFactory.getFeeCalculator("Computer Science");
        System.out.println(feeCalculator2.calculateFee());
    }
}
