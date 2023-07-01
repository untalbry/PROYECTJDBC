package com.jdbc.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import com.jdbc.model.TransferObject.Book;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class BookDAO implements DAO<Book> {
    private Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Book> getAll() throws SQLException {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM libros";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                books.add(new Book());
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return books;
    }

    @Override
    public Book getById(int id) throws SQLException {
        String sql = "SELECT * FROM libros WHERE libros_id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Book();
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
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
            ps.setInt(1, book.getBookId());
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

    @Override
    public Book getByName(String name) throws SQLException {
        String sql = "SELECT * FROM libros WHERE titulo = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);

            rs = ps.executeQuery();
            if (rs.next()) {
                return new Book(
                        rs.getInt("libro_id"),
                        rs.getInt("autor_id"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        rs.getInt("paginas"));
            } else {
                System.out.println("Regresando NULL");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error en query");
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
    }

}
