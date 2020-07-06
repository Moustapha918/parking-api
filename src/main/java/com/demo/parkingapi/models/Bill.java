package com.demo.parkingapi.models;

public class Bill {

    private String carName;
    private double amount;
    private long spentHours;
    private long spentMunites;


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getSpentHours() {
        return spentHours;
    }

    public void setSpentHours(long spentHours) {
        this.spentHours = spentHours;
    }

    public long getSpentMunites() {
        return spentMunites;
    }

    public void setSpentMunites(long spentMunites) {
        this.spentMunites = spentMunites;
    }
}
