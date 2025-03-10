package com.design.patterns.creational.factory;

public abstract class NetflixPlan {
    protected int price;
    abstract int getPrice();
    public int getTotalPrice(int months) {
        return price * months;
    }
}
