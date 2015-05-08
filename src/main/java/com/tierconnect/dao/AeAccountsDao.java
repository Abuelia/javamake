package com.tierconnect.dao;

import com.tierconnect.entities.AeAccountsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class AeAccountsDao implements DaoInterface<AeAccountsEntity,Integer>  {
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
    public AeAccountsEntity persist(AeAccountsEntity entity) {
        currentSession.save(entity);
          currentSession.flush();
        return findById((entity.getId()));
    }

    @Override
    public void update(AeAccountsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public AeAccountsEntity findById(Integer id) {
        AeAccountsEntity aeAccountsEntity = (AeAccountsEntity) currentSession.get(AeAccountsEntity.class, id);
        return aeAccountsEntity;
    }

    @Override
    public void delete(AeAccountsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<AeAccountsEntity> findAll() {
        List<AeAccountsEntity> aeAccountsEntities= (List<AeAccountsEntity>) currentSession.createQuery("from AeAccountsEntity ").list();
        return aeAccountsEntities;
    }

    @Override
    public void deleteAll() {
        List<AeAccountsEntity> aeAccountsEntities = findAll();
        aeAccountsEntities.forEach(this::delete);

    }
}
