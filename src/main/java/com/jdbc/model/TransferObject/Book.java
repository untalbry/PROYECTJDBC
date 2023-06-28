package com.jdbc.model.TransferObject;

public class Book {
    private int bookId;
    private int authorId;
    private int branchOfficeId;
    private int editionId;
    private String title;
    private int stock;
    private double price;

    public Book() {

    };

    public int getBookId() {
        return this.bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getBranchOfficeId() {
        return branchOfficeId;
    }

    public void setBranchOfficeId(int branchOfficeId) {
        this.branchOfficeId = branchOfficeId;
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
