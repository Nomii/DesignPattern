package com.design.patterns.creational.abstractfactory.subfactories;

import com.design.patterns.creational.abstractfactory.concreteimpl.BaraniFeeCalculator;
import com.design.patterns.creational.abstractfactory.concreteimpl.FeeCalculator;
import com.design.patterns.creational.abstractfactory.concreteimpl.FaujiFeeCalculator;
import com.design.patterns.creational.abstractfactory.concreteimpl.QuaidFeeCalculator;
import com.design.patterns.creational.abstractfactory.mainfactory.UniversityFactory;

public class CambridgeFactory extends UniversityFactory {

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course) {
            case "Math":
                return new FaujiFeeCalculator();
            case "Physics":
                return new QuaidFeeCalculator();
            case "Computer Science":
                return new BaraniFeeCalculator();
            default:
                break;
        }
        return null;
    }
}
