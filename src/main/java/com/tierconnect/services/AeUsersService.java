package com.tierconnect.services;

import com.tierconnect.dao.AeUsersDao;
import com.tierconnect.entities.AeUsersEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 28/04/2015.
 */
public class AeUsersService {
    private static AeUsersDao aeUsersDao;

    public AeUsersService() {
        aeUsersDao = new AeUsersDao();
    }

    public void persist(AeUsersEntity entity) {
        aeUsersDao.persist(entity);
    }

    public void update(AeUsersEntity entity) {
        aeUsersDao.update(entity);
    }

    public AeUsersEntity findById(String id) {
        AeUsersEntity aeUsersEntity = aeUsersDao.findById(id);
        return aeUsersEntity;
    }

    public void delete(String id) {
        AeUsersEntity aeUsersEntity = aeUsersDao.findById(id);
        aeUsersDao.delete(aeUsersEntity);
    }

    public List<AeUsersEntity> findAll() {
        List<AeUsersEntity> aeUsersEntities = aeUsersDao.findAll();
        return aeUsersEntities;
    }

    public void deleteAll() {
        aeUsersDao.deleteAll();
    }

    public AeUsersDao aeUsersDao() {
        return aeUsersDao;
    }
}
