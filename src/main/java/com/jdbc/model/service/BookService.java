package com.jdbc.model.service;

import com.jdbc.model.TransferObject.Book;
import com.jdbc.model.dao.BookDAO;
import com.jdbc.model.dao.DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class BookService {
    private DAO<Book> dao;

    public BookService(Connection connection) {
        this.dao = new BookDAO(connection);
    }

    public void getAll() throws SQLException {
        dao.getAll();
    }

    public Book getById(int id) throws SQLException {
        return dao.getById(id);
    }

    public Book getByName(String name) throws SQLException {
        return dao.getByName(name);
    }

    public void addBook(Book book) throws SQLException {
        dao.save(book);
    }

    public void updateBook(Book book, String[] params) throws SQLException {
        dao.update(book, params);
    }

    public void deleteBook(Book book) throws SQLException {
        dao.delete(book);
    }

}
