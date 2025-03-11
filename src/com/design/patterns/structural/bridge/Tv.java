package com.design.patterns.structural.bridge;

public class Tv implements Device {
    public boolean on = false;
    public int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is turned OFF");
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("TV volume set to " + volume + "%");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
