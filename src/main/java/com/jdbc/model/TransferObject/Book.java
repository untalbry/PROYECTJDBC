package com.jdbc.model.TransferObject;

public class Book {
    private int libroId;
    private int authorId;
    private int sucursalId;
    private int editionId;
    private String title;
    private int stock;
    private double price;

    public Book() {
    };

    public int getLibroId() {
        return this.libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public int getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getSucursalId() {
        return this.sucursalId;
    }

    public void setSucursalId(int sucursalId) {
        this.sucursalId = sucursalId;
    }

    public int getEditionId() {
        return this.editionId;
    }

    public void setEditionId(int editionId) {
        this.editionId = editionId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
