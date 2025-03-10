package com.design.patterns.creational.singelton;

public class EarlyInstantiation {
    // The instance is created at the time of class loading.
    // Memory in-efficient
    private static final EarlyInstantiation instance = new EarlyInstantiation();
    private EarlyInstantiation() {}

    public static EarlyInstantiation getInstance() {
        return instance;
    }
}
