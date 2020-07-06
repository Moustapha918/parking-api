package com.demo.parkingapi.business;

import com.demo.parkingapi.models.Bill;

public class Vehicle implements VehicleI{

    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {
    }

    public double calculateDueAmount(long spentTimeMunites) {


        double dueAmount = 0;

        if (spentTimeMunites < 60) {
            return dueAmount;
        }

        long munitesBeyondFourHours = (spentTimeMunites - (60 * 4));
        if (munitesBeyondFourHours > 0) {
            long halfBeyond4hours = (munitesBeyondFourHours + 29) / 30;
            double amountBeyondFourHours = halfBeyond4hours * 1.5;
            dueAmount = amountBeyondFourHours + 3 * 2.0;

            return dueAmount;
        }

        long hoursBefoure4 = (spentTimeMunites - 1) / 60;
        dueAmount = hoursBefoure4 * 2.0;
        return dueAmount;
    }

    public Bill printBill(double amount, long spentMunites) {

        Bill bill = new Bill();
        bill.setCarName(name);
        bill.setAmount(amount);
        bill.setSpentHours(spentMunites / 60);
        bill.setSpentMunites(spentMunites % 60);
        return bill;
    }

    protected double round(double amount){

        int IntegerPart = (int) amount;
        double DecimalPart = amount - IntegerPart;
        if( DecimalPart <= 0.5 && DecimalPart > 0)
            return IntegerPart + 0.5;

        if(DecimalPart > 0.5)
            return  IntegerPart + 1;

        return amount;
    }
}
