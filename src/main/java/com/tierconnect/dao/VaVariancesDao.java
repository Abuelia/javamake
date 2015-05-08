package com.tierconnect.dao;

import com.tierconnect.entities.VaVariancesEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class VaVariancesDao implements DaoInterface<VaVariancesEntity,String> {
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
    public VaVariancesEntity persist(VaVariancesEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(VaVariancesEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public VaVariancesEntity findById(String id) {
        VaVariancesEntity vaVariancesEntity=(VaVariancesEntity)currentSession.get(VaVariancesEntity.class,id);
        return vaVariancesEntity;
    }

    @Override
    public void delete(VaVariancesEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<VaVariancesEntity> findAll() {
        List<VaVariancesEntity> vaVariancesEntities=(List<VaVariancesEntity>)currentSession.createQuery("from VaVariancesEntity ");
        return vaVariancesEntities;
    }

    @Override
    public void deleteAll() {
        List<VaVariancesEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
