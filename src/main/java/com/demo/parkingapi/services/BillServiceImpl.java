package com.demo.parkingapi.services;


import com.demo.parkingapi.business.Vehicle;
import com.demo.parkingapi.business.VehicleI;
import com.demo.parkingapi.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

@Service
public class BillServiceImpl implements BillService{

    public Bill printBill(ParkingInput parkingInput){

        VehicleI vehicle = VehicleFactory.getVehicle(parkingInput);

        LocalDateTime entryTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(parkingInput.getEntryDate()),
                        TimeZone.getDefault().toZoneId());

        LocalDateTime leavingTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(parkingInput.getLeavingDate()),
                        TimeZone.getDefault().toZoneId());

        long durationMunites = Duration.between(entryTime, leavingTime).getSeconds() / 60;
        double amount = vehicle.calculateDueAmount(durationMunites);
        return vehicle.printBill(amount, durationMunites);
    }
}
