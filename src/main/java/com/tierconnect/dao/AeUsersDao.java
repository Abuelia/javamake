package com.tierconnect.dao;

import com.tierconnect.entities.AeUsersEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by PC on 28/04/2015.
 */
public class AeUsersDao implements DaoInterface<AeUsersEntity,String> {
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
    public AeUsersDao() {
    }

    @Override
    public AeUsersEntity persist(AeUsersEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(AeUsersEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public AeUsersEntity findById(String id) {
        AeUsersEntity aeUsersEntity=(AeUsersEntity)currentSession.get(AeUsersEntity.class,id);
        return aeUsersEntity;
    }

    @Override
    public void delete(AeUsersEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<AeUsersEntity> findAll() {
       Session session= HibernateUtil.getSessionFactory().openSession();
        List<AeUsersEntity> aeUsersEntities= (List<AeUsersEntity>) session.createQuery("from AeUsersEntity ").list();
        System.out.println(aeUsersEntities);
        return aeUsersEntities;
    }

    @Override
    public void deleteAll() {
        List<AeUsersEntity> entityList = findAll();
        entityList.forEach(this::delete);

    }
}
