package com.lapin.store.dao;

import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractDao<T, I extends Serializable> implements GenericDao<T, I> {
    protected SessionFactory sessionFactory;
    private Class<T> genericType;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected AbstractDao(){
        genericType = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    @Override
    public T findById(I id) {
        return (T)sessionFactory.getCurrentSession().get(genericType, id);
    }

    @Override
    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(genericType).list();
    }

    @Override
    public void delete(T t) {
        sessionFactory.getCurrentSession().delete(t);
    }

    @Override
    public void save(T t) {
        sessionFactory.getCurrentSession().save(t);
    }
}
