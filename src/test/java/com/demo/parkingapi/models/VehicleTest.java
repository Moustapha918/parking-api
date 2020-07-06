package com.demo.parkingapi.models;

import com.demo.parkingapi.business.Bike;
import com.demo.parkingapi.business.GPLVehicle;
import com.demo.parkingapi.business.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void calculateDueAmount() {

        Vehicle generic = new Vehicle("generic");
        Vehicle bike = new Bike("Bike");
        Vehicle gplVehicle = new GPLVehicle("GPL car");

        double amount_For_Generic_Vehicle_Less_than_For_Hours = generic.calculateDueAmount(60 + 46);
        assertEquals(2, amount_For_Generic_Vehicle_Less_than_For_Hours);

        double generic_vehicle_beyond_four_hours = generic.calculateDueAmount(4*60 + 1);
        assertEquals(7.5, generic_vehicle_beyond_four_hours);

        double bikeAmount = bike.calculateDueAmount(5*60 + 7);
        assertEquals(5.5, bikeAmount);
        double gplAmount = gplVehicle.calculateDueAmount(7*60 + 27);
        assertEquals(18, gplAmount);
    }

    @Test
    void printFacture() {
    }
}