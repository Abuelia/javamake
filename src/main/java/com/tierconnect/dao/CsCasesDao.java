package com.tierconnect.dao;

import com.tierconnect.entities.CsCasesEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class CsCasesDao implements DaoInterface<CsCasesEntity,String> {

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
    public CsCasesEntity persist(CsCasesEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(CsCasesEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public CsCasesEntity findById(String id) {
        CsCasesEntity csCasesEntity=(CsCasesEntity)currentSession.get(CsCasesEntity.class,id);
        return csCasesEntity;
    }

    @Override
    public void delete(CsCasesEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<CsCasesEntity> findAll() {
        List<CsCasesEntity> csCasesEntities=(List<CsCasesEntity>)currentSession.createQuery("from CsCasesEntity ");
        return csCasesEntities;
    }

    @Override
    public void deleteAll() {
        List<CsCasesEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
