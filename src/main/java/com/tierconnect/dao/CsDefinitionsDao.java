package com.tierconnect.dao;

import com.tierconnect.entities.CsDefinitionsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class CsDefinitionsDao implements DaoInterface<CsDefinitionsEntity,String> {

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
    public CsDefinitionsEntity persist(CsDefinitionsEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(CsDefinitionsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public CsDefinitionsEntity findById(String id) {
        CsDefinitionsEntity csDefinitionsEntity=(CsDefinitionsEntity)currentSession.get(CsDefinitionsEntity.class,id);
        return csDefinitionsEntity;
    }

    @Override
    public void delete(CsDefinitionsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<CsDefinitionsEntity> findAll() {
        List<CsDefinitionsEntity> csDefinitionsEntities=(List<CsDefinitionsEntity>)currentSession.createQuery("from CsDefinitionsEntity ");
        return csDefinitionsEntities;
    }

    @Override
    public void deleteAll() {
        List<CsDefinitionsEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
