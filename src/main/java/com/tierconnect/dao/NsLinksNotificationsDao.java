package com.tierconnect.dao;

import com.tierconnect.entities.NsLinksNotificationsEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class NsLinksNotificationsDao implements DaoInterface<NsLinksNotificationsEntity,String>{
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
    public NsLinksNotificationsEntity persist(NsLinksNotificationsEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(NsLinksNotificationsEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public NsLinksNotificationsEntity findById(String id) {
        NsLinksNotificationsEntity nsLinksNotificationsEntity=(NsLinksNotificationsEntity)currentSession.get(NsLinksNotificationsEntity.class,id);
        return nsLinksNotificationsEntity;
    }

    @Override
    public void delete(NsLinksNotificationsEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<NsLinksNotificationsEntity> findAll() {
        List<NsLinksNotificationsEntity> nsLinksNotificationsEntities=(List<NsLinksNotificationsEntity>)currentSession.createQuery("from NsLinksNotificationsEntity ");
        return nsLinksNotificationsEntities;
    }

    @Override
    public void deleteAll() {
        List<NsLinksNotificationsEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
