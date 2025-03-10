package com.design.patterns.creational.factory;

public class NetflixPlanFactory {
    public static NetflixPlan getPlan(String planType) {
        if (planType == null || planType.trim().isEmpty()) {
            return null;
        }
        switch(planType.toUpperCase()) {
            case "BASIC": return new Basic();
            case "STANDARD": return new Standard();
            case "PREMIUM": return new Premium();
            default: throw new IllegalArgumentException("Invalid plan type: " + planType);
        }
    }
}

