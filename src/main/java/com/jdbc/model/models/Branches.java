package com.jdbc.model.models;

import java.util.Date;

public class Branches {
    private int addressId;
    private Date openingTime;
    private Date closingTime;
    private int employeesNum;

    public Branches() {
    }

    public int getAddressId() {
        return this.addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public Date getOpeningTime() {
        return this.openingTime;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    public Date getClosingTime() {
        return this.closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    public int getEmployeesNum() {
        return this.employeesNum;
    }

    public void setEmployeesNum(int employeesNum) {
        this.employeesNum = employeesNum;
    }

}
