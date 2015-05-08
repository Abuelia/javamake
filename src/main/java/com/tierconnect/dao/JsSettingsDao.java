package com.tierconnect.dao;

import com.tierconnect.entities.JsSettingsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
public class JsSettingsDao implements DaoInterface<JsSettingsEntity,Integer> {

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
    public JsSettingsEntity persist(JsSettingsEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return entity;
    }

    @Override
    public void update(JsSettingsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public JsSettingsEntity findById(Integer id) {
        JsSettingsEntity jsSettingsEntity=(JsSettingsEntity)currentSession.get(JsSettingsEntity.class,id);
        return jsSettingsEntity;
    }

    @Override
    public void delete(JsSettingsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<JsSettingsEntity> findAll() {
        List<JsSettingsEntity> jsSettingsEntities=(List<JsSettingsEntity>)currentSession.createQuery("from JsSettingsEntity ");
        return jsSettingsEntities;
    }

    @Override
    public void deleteAll() {
        List<JsSettingsEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
