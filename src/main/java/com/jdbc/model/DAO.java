package com.jdbc.model;

import com.jdbc.model.book.Book;

public interface DAO<Type> {
    List<Type> getAll();

    Book getById(int id);

    int save(Book book);

    int upadate(Book book);

    int delete(int bookId);
}
