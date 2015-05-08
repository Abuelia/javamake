package com.tierconnect.dao;

import com.tierconnect.entities.JsListsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class JsListDao implements DaoInterface<JsListsEntity,String> {

    private Session currentSession;
    private Transaction currentTransaction;
    public Session openCurrentSession() {
        currentSession = HibernateUtil.getSessionFactory().openSession();
        return currentSession;

    }
    public Session openCurrentSessionwithTransaction() {
        currentSession = HibernateUtil.getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }
    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    @Override
    public JsListsEntity persist(JsListsEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(JsListsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public JsListsEntity findById(String id) {
        JsListsEntity jsListsEntity=(JsListsEntity)currentSession.get(JsListsEntity.class,id);
        return jsListsEntity;
    }

    @Override
    public void delete(JsListsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<JsListsEntity> findAll() {
        List<JsListsEntity> jsListsEntities=(List<JsListsEntity>)currentSession.createQuery("from JsListsEntity ");
        return jsListsEntities;
    }

    @Override
    public void deleteAll() {
        List<JsListsEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
