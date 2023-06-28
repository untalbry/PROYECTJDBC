package com.jdbc.model.dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO<Type> {
    List<Type> getAll() throws SQLException;

    Type getById(int id) throws SQLException;

    void save(Type type) throws SQLException;

    void update(Type type, String[] params) throws SQLException;

    void delete(Type type) throws SQLException;
}
