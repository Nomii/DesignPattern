package com.design.patterns.creational.abstractfactory.subfactories;

import com.design.patterns.creational.abstractfactory.concreteimpl.FeeCalculator;
import com.design.patterns.creational.abstractfactory.concreteimpl.IqraFeeCalculator;
import com.design.patterns.creational.abstractfactory.concreteimpl.NustFeeCalculator;
import com.design.patterns.creational.abstractfactory.concreteimpl.UIITFeeCalculator;
import com.design.patterns.creational.abstractfactory.mainfactory.UniversityFactory;

public class StandfordFactory extends UniversityFactory {

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course) {
            case "Math":
                return new NustFeeCalculator();
            case "Physics":
                return new IqraFeeCalculator();
            case "Computer Science":
                return new UIITFeeCalculator();
            default:
                break;
        }
        return null;
    }
}
