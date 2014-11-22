package com.lapin.store.dao;

import java.io.Serializable;

/**
 * Created by Denys Lapin on 13.11.2014.
 */
public interface GenericDao<T,I extends Serializable>{

    T findById(I id);

    java.util.List<T> findAll();

    void delete(T t);

    void updateById(I id);

    void insert(T t);
}
