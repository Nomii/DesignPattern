package com.design.patterns.creational.factory;

public class Premium extends NetflixPlan{
    @Override
    int getPrice() {
        price = 1100;
        return price;
    }
}
