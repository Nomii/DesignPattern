package com.design.patterns.creational.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NetflixPlanFactory factory = new NetflixPlanFactory();
        System.out.print("Choose Plan : ");
        String subscriptionPlan = sc.next();
        System.out.print("Choose months :");
        int months = sc.nextInt();
        NetflixPlan plan = factory.getPlan(subscriptionPlan);
        System.out.println("Monthly Bill amount for selected subscription :" +plan.getPrice());
        System.out.println("Total Bill for selected months :" +plan.getTotalPrice(months));
    }
}
