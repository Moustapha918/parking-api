package com.demo.parkingapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParkingInput {

    private String car;
    private boolean isGPL;

    private boolean isBike;
    private long entryDate;
    private long leavingDate;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public boolean isGPL() {
        return isGPL;
    }

    @JsonProperty("isGPL")
    public void setGPL(boolean GPL) {
        isGPL = GPL;
    }

    public boolean isBike() {
        return isBike;
    }

    @JsonProperty("isBike")
    public void setBike(boolean bike) {
        isBike = bike;
    }

    public long getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(long entryDate) {
        this.entryDate = entryDate;
    }

    public long getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(long leavingDate) {
        this.leavingDate = leavingDate;
    }
}
