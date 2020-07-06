package com.demo.parkingapi.services;

import com.demo.parkingapi.models.Bill;
import com.demo.parkingapi.models.ParkingInput;

public interface BillService {

    Bill printBill(ParkingInput parkingInput);
}
