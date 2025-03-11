package com.design.patterns.structural.bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is turned ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is turned OFF");
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Radio volume set to " + volume + "%");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
