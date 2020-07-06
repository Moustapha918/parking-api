package com.demo.parkingapi.resources;


import com.demo.parkingapi.models.Bill;
import com.demo.parkingapi.models.ParkingInput;
import com.demo.parkingapi.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BillController {

    @Autowired
    BillService billService;

    @PostMapping("parking/printBill")
    public ResponseEntity printBill(@RequestBody ParkingInput parkingInput){

            if(verifyParkingInput(parkingInput))
                return  ResponseEntity.ok(billService.printBill(parkingInput));

            return ResponseEntity.badRequest().body("invalid input");
    }

    private boolean verifyParkingInput(ParkingInput input){

        if(input == null) return false;
        if(input.isGPL() && input.isBike()) return false;

        return true;
    }
}
