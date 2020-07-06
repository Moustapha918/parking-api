package com.demo.parkingapi.business;

import com.demo.parkingapi.models.Bill;

public class GPLVehicle extends Vehicle implements VehicleI{

    public GPLVehicle(String name) {
        super(name);
    }

    @Override
    public double calculateDueAmount(long spentTimeMunites) {
        double standardAmount =  super.calculateDueAmount(spentTimeMunites);
        double gplAmount = standardAmount + standardAmount * 0.07;
        return round(gplAmount);
    }

    @Override
    public Bill printBill(double amount, long spentMunites) {
        return super.printBill(amount, spentMunites);
    }
}
