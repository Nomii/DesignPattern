package com.design.patterns.creational.singelton;

public class VolatileSingelton {
    // Uses volatile to ensure visibility across threads
    // Ensures thread safety without impacting performance
    // All threads can see latest updated value of instance immediately after the update
    private static volatile VolatileSingelton instance;
    private VolatileSingelton() {}

    public static VolatileSingelton getInstance() {
        if (instance == null) {
            synchronized (VolatileSingelton.class) {
                if (instance == null) {
                    instance = new VolatileSingelton();
                }
            }
        }
        return instance;
    }
}
