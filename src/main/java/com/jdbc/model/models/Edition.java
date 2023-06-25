package com.jdbc.model.models;

public class Edition {
    private int editionId;
    private int editorialId;
    private int edtionNumber;
    private String languaje;
    private String genre;
    private String synopsis;
    private int totalPages;

    public Edition() {
    }

    public int getEditionId() {
        return this.editionId;
    }

    public void setEditionId(int editionId) {
        this.editionId = editionId;
    }

    public int getEditorialId() {
        return this.editorialId;
    }

    public void setEditorialId(int editorialId) {
        this.editorialId = editorialId;
    }

    public int getEdtionNumber() {
        return this.edtionNumber;
    }

    public void setEdtionNumber(int edtionNumber) {
        this.edtionNumber = edtionNumber;
    }

    public String getLanguaje() {
        return this.languaje;
    }

    public void setLanguaje(String languaje) {
        this.languaje = languaje;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return this.synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
