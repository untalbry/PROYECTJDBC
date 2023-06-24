package com.jdbc.model.book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.DAO;
import com.jdbc.model.Conection;

public class BookDB extends Conection implements DAO<Book> {

    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();

        try {
            // Establish the database connection
            getConexion();

            // Create a statement object
            Statement statement = con.createStatement();

            // Execute the SQL query to retrieve all books from the "Books" table
            ResultSet rs = statement.executeQuery("SELECT * FROM Books");

            while (rs.next()) {
                Book book = new Book();

                /*
                 * Set the attributes of the Book object using the corresponding
                 * values from the result set (rs) obtained from the database.
                 * Add the book to the list of books.
                 */

                books.add(book);
            }

            // Close the result set, statement, and database connection
            rs.close();
            statement.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        return books;
    }

    @Override
    public Book getById(int id) {
        return books.get(id);
    }

    @Override
    public int save(Book type) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int update(Book type) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete(Book type) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
