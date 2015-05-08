package com.tierconnect.dao;

import com.tierconnect.entities.VaLinksChecksEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class VaLinksChecksDao implements DaoInterface<VaLinksChecksEntity,String> {

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
    public VaLinksChecksEntity persist(VaLinksChecksEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(VaLinksChecksEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public VaLinksChecksEntity findById(String id) {
        VaLinksChecksEntity vaLinksChecksEntity=(VaLinksChecksEntity)currentSession.get(VaLinksChecksEntity.class,id);
        return vaLinksChecksEntity;
    }

    @Override
    public void delete(VaLinksChecksEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<VaLinksChecksEntity> findAll() {
        List<VaLinksChecksEntity> vaLinksChecksEntities=(List<VaLinksChecksEntity>)currentSession.createQuery("from VaLinksChecksEntity ");
        return vaLinksChecksEntities;
    }

    @Override
    public void deleteAll() {
        List<VaLinksChecksEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
