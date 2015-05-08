package com.tierconnect.services;

import com.tierconnect.dao.AeModelTypesDao;
import com.tierconnect.entities.AeModelTypesEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 28/04/2015.
 */
public class AeModelTypesService {
    private static AeModelTypesDao aeModelTypesDao;

    public AeModelTypesService() {
        aeModelTypesDao = new AeModelTypesDao();
    }

    public void persist(AeModelTypesEntity entity) {
        aeModelTypesDao.persist(entity);
    }

    public void update(AeModelTypesEntity entity) {
        aeModelTypesDao.update(entity);
    }

    public AeModelTypesEntity findById(String id) {
        AeModelTypesEntity aeModelTypesEntity = aeModelTypesDao.findById(id);
        return aeModelTypesEntity;
    }

    public void delete(String id) {
        AeModelTypesEntity aeModelTypesEntity = aeModelTypesDao.findById(id);
        aeModelTypesDao.delete(aeModelTypesEntity);
    }

    public List<AeModelTypesEntity> findAll() {
        List<AeModelTypesEntity> aeModelTypesEntities = aeModelTypesDao.findAll();
        return aeModelTypesEntities;
    }

    public void deleteAll() {
        aeModelTypesDao.deleteAll();
    }

    public AeModelTypesDao aeUsersDao() {
        return aeModelTypesDao;
    }
}
