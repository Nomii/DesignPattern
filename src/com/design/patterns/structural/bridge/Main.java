package com.design.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        tv.turnOn();
        tv.setVolume(20);
        tv.turnOff();

        System.out.println("----------------------");

        Device radio = new Radio();
        radio.turnOn();
        radio.setVolume(15);
        radio.turnOff();
    }
}
