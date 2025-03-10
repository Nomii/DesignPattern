package com.design.patterns.creational.singelton;

public class ThreadSafeSingelton {
    // The instance is created only when it is first requested.
    // Ensures only one thread creates the instance
    // Synchronized method affects performance.
    private static ThreadSafeSingelton instance;
    private ThreadSafeSingelton() {}

    public static synchronized ThreadSafeSingelton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingelton();
        }
        return instance;
    }
}
