package com.tierconnect.dao;

import com.tierconnect.entities.JsVaChSettingsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
public class JsVaChSettingsDao implements DaoInterface<JsVaChSettingsEntity,Integer>{
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
    public JsVaChSettingsEntity persist(JsVaChSettingsEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return entity;
    }

    @Override
    public void update(JsVaChSettingsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public JsVaChSettingsEntity findById(Integer id) {
        JsVaChSettingsEntity jsSettingsEntity=(JsVaChSettingsEntity)currentSession.get(JsVaChSettingsEntity.class,id);
        return jsSettingsEntity;
    }

    @Override
    public void delete(JsVaChSettingsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<JsVaChSettingsEntity> findAll() {
        List<JsVaChSettingsEntity> jsVaChSettingsEntities=(List<JsVaChSettingsEntity>)currentSession.createQuery("from JsVaChSettingsEntity ");
        return jsVaChSettingsEntities;
    }

    @Override
    public void deleteAll() {
        List<JsVaChSettingsEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
