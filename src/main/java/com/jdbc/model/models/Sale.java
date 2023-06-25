package com.jdbc.model.models;

public class Sale {
    private int clientId;
    private double total;

    public Sale() {
    }

    public int getClientId() {
        return this.clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
