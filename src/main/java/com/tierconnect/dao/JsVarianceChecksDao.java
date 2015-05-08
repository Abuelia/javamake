package com.tierconnect.dao;

import com.tierconnect.entities.JsVarianceChecksEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
public class JsVarianceChecksDao implements DaoInterface<JsVarianceChecksEntity,Integer> {
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
    public JsVarianceChecksEntity persist(JsVarianceChecksEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return entity;
    }

    @Override
    public void update(JsVarianceChecksEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public JsVarianceChecksEntity findById(Integer id) {
        JsVarianceChecksEntity jsVarianceChecksEntity = (JsVarianceChecksEntity) currentSession.get(JsVarianceChecksEntity.class, id);
        return jsVarianceChecksEntity;
    }

    @Override
    public void delete(JsVarianceChecksEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<JsVarianceChecksEntity> findAll() {
        List<JsVarianceChecksEntity> jsVarianceChecksEntities= (List<JsVarianceChecksEntity>) currentSession.createQuery("from JsVarianceChecksEntity ").list();
        return jsVarianceChecksEntities;
    }

    @Override
    public void deleteAll() {
        List<JsVarianceChecksEntity> entityList = findAll();
        entityList.forEach(this::delete);

    }
    public List<JsVarianceChecksEntity> getVarianceChecks(){
        String query=" from JsVarianceChecksEntity variance ORDER BY variance.startDtctime ";
        List<JsVarianceChecksEntity> jsVarianceChecksEntities = (List<JsVarianceChecksEntity>)currentSession.createQuery(query).list();
        return jsVarianceChecksEntities;
    }
}
