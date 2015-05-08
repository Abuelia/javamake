package com.tierconnect.dao;

import com.tierconnect.entities.AeModelTypesEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 28/04/2015.
 */
public class AeModelTypesDao implements DaoInterface<AeModelTypesEntity,String> {
    static Session session= HibernateUtil.getSessionFactory().openSession();
    public AeModelTypesDao() {
    }

    @Override
    public AeModelTypesEntity persist(AeModelTypesEntity entity) {
        Transaction tx = (Transaction) session.beginTransaction();
        session.save(entity);
        tx.commit();
        return null;
    }

    @Override
    public void update(AeModelTypesEntity entity) {
        Transaction tx = (Transaction) session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public AeModelTypesEntity findById(String id) {
        Transaction tx = (Transaction) session.beginTransaction();
        AeModelTypesEntity aeModelTypesEntity = (AeModelTypesEntity) session.get(AeModelTypesEntity.class, id);
        return aeModelTypesEntity;
    }

    @Override
    public void delete(AeModelTypesEntity entity) {
        Transaction tx = (Transaction) session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<AeModelTypesEntity> findAll() {
        List<AeModelTypesEntity> aeModelTypesEntities= (List<AeModelTypesEntity>) session.createQuery("from AeModelTypesEntity ").list();
        return aeModelTypesEntities;
    }

    @Override
    public void deleteAll() {
        List<AeModelTypesEntity> entityList = findAll();
        entityList.forEach(this::delete);

    }
}
