package com.jdbc.model.models;

public class Editorial {
    private int editorialId;
    private String name;
    private double phoneNumber;
    private String email;
    private String url;
    private String description;

    public Editorial() {
    }

    public int getEditorialId() {
        return this.editorialId;
    }

    public void setEditorialId(int editorialId) {
        this.editorialId = editorialId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
