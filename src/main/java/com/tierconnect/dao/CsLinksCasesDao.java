package com.tierconnect.dao;
import com.tierconnect.entities.CsLinksCasesEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class CsLinksCasesDao implements DaoInterface<CsLinksCasesEntity,String> {

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
    public CsLinksCasesEntity persist(CsLinksCasesEntity entity) {
        currentSession.save(entity);
        currentSession.flush();
        return findById(String.valueOf(entity.getId()));
    }

    @Override
    public void update(CsLinksCasesEntity entity) {
        currentSession.update(entity);
    }

    @Override
    public CsLinksCasesEntity findById(String id) {
        CsLinksCasesEntity csLinksCasesEntity=(CsLinksCasesEntity)currentSession.get(CsLinksCasesEntity.class,id);
        return csLinksCasesEntity;
    }

    @Override
    public void delete(CsLinksCasesEntity entity) {
        currentSession.delete(entity);
    }

    @Override
    public List<CsLinksCasesEntity> findAll() {
        List<CsLinksCasesEntity> csLinksCasesEntities=(List<CsLinksCasesEntity>)currentSession.createQuery("from CsLinksCasesEntity ");
        return csLinksCasesEntities;
    }

    @Override
    public void deleteAll() {
        List<CsLinksCasesEntity> entities=findAll();
        entities.forEach(this::delete);
    }
}
