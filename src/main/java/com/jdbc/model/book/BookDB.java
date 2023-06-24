package com.jdbc.model.book;

import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.DAO;
import com.jdbc.model.book.Book;

public class BookDB implements DAO<Book> {
    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getAll() {

        return books;
    }

    @Override
    public Book getById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public int save(Book type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public int update(Book type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete(Book type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
