package com.design.patterns.creational.singelton;

public class LazyInstantiation {
    // The instance is created only when it is first requested.
    // Not thread-safe. Multiple threads might create multiple instances
    private static LazyInstantiation instance;
    private LazyInstantiation() {}

    public static LazyInstantiation getInstance(){
        if(instance == null){
            instance = new LazyInstantiation();
        }
        return instance;
    }
}
