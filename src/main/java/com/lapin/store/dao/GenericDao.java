package com.lapin.store.dao;

import java.io.Serializable;

public interface GenericDao<T,I extends Serializable>{

    T findById(I id);

    java.util.List<T> findAll();

    void delete(T t);

    void save(T t);
}
