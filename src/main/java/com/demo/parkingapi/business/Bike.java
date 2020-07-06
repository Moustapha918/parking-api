package com.demo.parkingapi.business;

import com.demo.parkingapi.models.Bill;

public class Bike extends Vehicle implements VehicleI{

    public Bike(String name) {
        super(name);
    }

    @Override
    public double calculateDueAmount(long spentTimeMunites) {
        double bikeAmount =  super.calculateDueAmount(spentTimeMunites) / 2;
        return round(bikeAmount);
    }

    @Override
    public Bill printBill(double amount, long spentMunites) {
        return super.printBill(amount, spentMunites);
    }
}
