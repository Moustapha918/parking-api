package com.demo.parkingapi.services;

import com.demo.parkingapi.business.Bike;
import com.demo.parkingapi.business.GPLVehicle;
import com.demo.parkingapi.business.Vehicle;
import com.demo.parkingapi.business.VehicleI;
import com.demo.parkingapi.models.ParkingInput;


public abstract class VehicleFactory {

    public static VehicleI getVehicle(ParkingInput input){

        VehicleI vehicle;
        if(input.isBike())
            vehicle = new Bike(input.getCar());
        else {
            if(input.isGPL())
                vehicle = new GPLVehicle(input.getCar());
            else
                vehicle = new Vehicle(input.getCar());
        }
        return vehicle;
    }
}
