package com.jdbc.model.dao;

import java.util.List;

public interface DAO<Type> {
    List<Type> getAll();

    Type getById(int id);

    int save(Type type);

    int update(Type type);

    int delete(Type type);
}
