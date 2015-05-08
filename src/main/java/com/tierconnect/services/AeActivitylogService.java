package com.tierconnect.services;

import com.tierconnect.dao.AeActivitylogDao;
import com.tierconnect.entities.AeActivitylogEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 28/04/2015.
 */
public class AeActivitylogService {
    private static AeActivitylogDao aeActivitylogDao;

    public AeActivitylogService() {
        aeActivitylogDao = new AeActivitylogDao();
    }

    public void persist(AeActivitylogEntity entity) {
        aeActivitylogDao.persist(entity);
    }

    public void update(AeActivitylogEntity entity) {
        aeActivitylogDao.update(entity);
    }

    public AeActivitylogEntity findById(String id) {
        AeActivitylogEntity aeActivitylogEntity = aeActivitylogDao.findById(id);
        return aeActivitylogEntity;
    }

    public void delete(String id) {
        AeActivitylogEntity aeActivitylogEntity = aeActivitylogDao.findById(id);
        aeActivitylogDao.delete(aeActivitylogEntity);
    }

    public List<AeActivitylogEntity> findAll() {
        List<AeActivitylogEntity> aeActivitylogEntities = aeActivitylogDao.findAll();
        return aeActivitylogEntities;
    }

    public void deleteAll() {
        aeActivitylogDao.deleteAll();
    }

    public AeActivitylogDao aeUsersDao() {
        return aeActivitylogDao;
    }
}
