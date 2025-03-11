package com.design.patterns.creational.factory;

public class Standard extends NetflixPlan{

    @Override
    int getPrice() {
        price = 800;
        return price;
    }
}
