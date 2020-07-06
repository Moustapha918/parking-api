package com.demo.parkingapi.business;

import com.demo.parkingapi.models.Bill;

public interface VehicleI {

    double calculateDueAmount(long spentTimeMunites);
    Bill printBill(double amount, long durationMunites);
}
