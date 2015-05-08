package com.tierconnect.dao;

import com.tierconnect.entities.NsNotificationsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class NsNotificationsDao  implements DaoInterface<NsNotificationsEntity,String> {
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
    public NsNotificationsEntity persist(NsNotificationsEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(NsNotificationsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public NsNotificationsEntity findById(String id) {
        NsNotificationsEntity nsNotificationsEntity=(NsNotificationsEntity)currentSession.get(NsNotificationsEntity.class,id);
        return nsNotificationsEntity;
    }

    @Override
    public void delete(NsNotificationsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<NsNotificationsEntity> findAll() {
        List<NsNotificationsEntity> nsNotificationsEntities=(List<NsNotificationsEntity>)currentSession.createQuery("from NsNotificationsEntity ");
        return nsNotificationsEntities;
    }

    @Override
    public void deleteAll() {
        List<NsNotificationsEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
