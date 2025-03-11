package com.design.patterns.structural.bridge;

interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    boolean isOn();
}
