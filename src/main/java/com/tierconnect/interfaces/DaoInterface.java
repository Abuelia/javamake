package com.tierconnect.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Paul Landaeta on 28/04/2015.
 */
public interface DaoInterface<T, Id extends Serializable> {
    public T persist(T entity);
    public void update(T entity);
    public T findById(Id id);
    public void delete(T entity);
    public List<T> findAll();
    public void deleteAll();
}
