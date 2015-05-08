package com.tierconnect.dao;

import com.tierconnect.entities.VaChecksEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class VaChecksDao implements DaoInterface<VaChecksEntity,String>{
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
    public VaChecksEntity persist(VaChecksEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(VaChecksEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public VaChecksEntity findById(String id) {
        VaChecksEntity jsListsEntity=(VaChecksEntity)currentSession.get(VaChecksEntity.class,id);
        return jsListsEntity;
    }

    @Override
    public void delete(VaChecksEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<VaChecksEntity> findAll() {
        List<VaChecksEntity> vaChecksEntities=(List<VaChecksEntity>)currentSession.createQuery("from VaChecksEntity ");
        return vaChecksEntities;
    }

    @Override
    public void deleteAll() {
        List<VaChecksEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
