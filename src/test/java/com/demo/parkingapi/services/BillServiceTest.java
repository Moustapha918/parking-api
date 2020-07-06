package com.demo.parkingapi.services;

import com.demo.parkingapi.models.Bill;
import com.demo.parkingapi.models.ParkingInput;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class BillServiceTest {

    BillService billService = new BillServiceImpl();

    @Test
    void getFacture() {

        LocalDateTime time = LocalDateTime.parse("02.07.2020 12:10:01", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        LocalDateTime time2 = LocalDateTime.parse("02.07.2020 14:20:01", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));


        long entryDateTimeStamp  = getTimeStamp(time);
        long leavingDateTimeStamp = getTimeStamp(time2);

        ParkingInput parkingInput = new ParkingInput();
        parkingInput.setEntryDate(entryDateTimeStamp);
        parkingInput.setLeavingDate(leavingDateTimeStamp);
        parkingInput.setCar("Vehicle Normal");

        Bill bill = billService.printBill(parkingInput);

        assertEquals(4.0, bill.getAmount());
    }

    private long getTimeStamp(LocalDateTime date){

        return date.toInstant(OffsetDateTime.now().getOffset()).toEpochMilli();
    }
}