package com.jdbc.model.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.List;
import com.jdbc.model.TransferObject.Book;

public class BookDAO implements DAO<Book> {
    private Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Book> getAll() throws SQLException {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Book getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public void save(Book book) throws SQLException {
        String sql = "INSERT INTO libros () VALUES (?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(sql);
            // Colocar todos los sets para los campos de la "libros"
            ps.setString(0, sql);
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            connection.setAutoCommit(true);
        }
    }

    @Override
    public void update(Book book, String[] params) throws SQLException {
        String sql = "UPDATE libros SET titulo = ? ...";
        PreparedStatement ps = null;
        try {
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(sql);
            // Colocar todos los sets para actualizar los campos de la tabla "libros"
            ps.setString(1, params[0]);
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            connection.setAutoCommit(true);
        }
    }

    @Override
    public void delete(Book book) throws SQLException {
        String sql = "DELETE FROM libros WHERE id = ?";
        PreparedStatement ps = null;
        try {
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(sql);
            ps.setInt(1, book.getLibroId());
            ps.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            connection.setAutoCommit(true);
        }
    }

}