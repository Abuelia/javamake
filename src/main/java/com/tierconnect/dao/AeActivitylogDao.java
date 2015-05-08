package com.tierconnect.dao;

import com.tierconnect.entities.AeActivitylogEntity;
import com.tierconnect.interfaces.DaoInterface;
import com.tierconnect.utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Paul Landaeta on 28/04/2015.
 */
public class AeActivitylogDao implements DaoInterface<AeActivitylogEntity,String> {
    static Session session= HibernateUtil.getSessionFactory().openSession();
    public AeActivitylogDao() {
    }

    @Override
    public AeActivitylogEntity persist(AeActivitylogEntity entity) {
        Transaction tx = (Transaction) session.beginTransaction();
        session.save(entity);
        tx.commit();
        return null;
    }

    @Override
    public void update(AeActivitylogEntity entity) {
        Transaction tx = (Transaction) session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public AeActivitylogEntity findById(String id) {
        Transaction tx = (Transaction) session.beginTransaction();
        AeActivitylogEntity aeActivitylogEntity = (AeActivitylogEntity) session.get(AeActivitylogEntity.class, id);
        return aeActivitylogEntity;
    }

    @Override
    public void delete(AeActivitylogEntity entity) {
        Transaction tx = (Transaction) session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<AeActivitylogEntity> findAll() {
        List<AeActivitylogEntity> aeActivitylogEntities= (List<AeActivitylogEntity>) session.createQuery("from AeActivitylogEntity ").list();
        return aeActivitylogEntities;
    }

    @Override
    public void deleteAll() {
        List<AeActivitylogEntity> entityList = findAll();
        entityList.forEach(this::delete);

    }
}
