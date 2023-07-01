package com.jdbc.model.TransferObject;

public class Book {
    private int bookId;
    private int authorId;
    private String title;
    private String description;
    private int pages;

    public Book() {
    };

    public Book(int bookId, int authorId, String title, String description, int pages) {
        this.bookId = bookId;
        this.authorId = authorId;
        this.title = title;
        this.description = description;
        this.pages = pages;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
