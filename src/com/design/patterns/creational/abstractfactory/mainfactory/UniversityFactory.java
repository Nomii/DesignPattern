package com.design.patterns.creational.abstractfactory.mainfactory;

import com.design.patterns.creational.abstractfactory.subfactories.CambridgeFactory;
import com.design.patterns.creational.abstractfactory.concreteimpl.FeeCalculator;
import com.design.patterns.creational.abstractfactory.subfactories.StandfordFactory;

public abstract class UniversityFactory {
    private static final int cutOff = 100;

    public static UniversityFactory getUniversityFactory(int score) {
        if(score > cutOff) {
            return new StandfordFactory();
        }
        return new CambridgeFactory();
    }

    public abstract FeeCalculator getFeeCalculator(String course);
}
