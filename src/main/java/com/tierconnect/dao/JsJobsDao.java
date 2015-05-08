package com.tierconnect.dao;

import com.tierconnect.entities.JsJobsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by PC on 28/04/2015.
 */
public class JsJobsDao implements DaoInterface<JsJobsEntity,Integer> {
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

    public JsJobsDao() {
    }


    @Override
    public JsJobsEntity persist(JsJobsEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return entity;
    }

    @Override
    public void update(JsJobsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public JsJobsEntity findById(Integer id) {
        JsJobsEntity jsJobsEntity = (JsJobsEntity) currentSession.get(JsJobsEntity.class, id);
        return jsJobsEntity;
    }

    @Override
    public void delete(JsJobsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<JsJobsEntity> findAll() {
        List<JsJobsEntity> jsJobsEntities= (List<JsJobsEntity>) currentSession.createQuery("from JsJobsEntity ").list();
        return jsJobsEntities;
    }

    @Override
    public void deleteAll() {
        List<JsJobsEntity> entityList = findAll();
        entityList.forEach(this::delete);

    }

    public JsJobsEntity findbyPublicId(String publicId) {
        JsJobsEntity jsJobsEntity= (JsJobsEntity)currentSession.createQuery("from JsJobsEntity where JsJobsEntity .publicId="+publicId).list();
        return jsJobsEntity;

    }
}
