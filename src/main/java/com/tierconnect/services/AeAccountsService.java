package com.tierconnect.services;

import com.tierconnect.dao.AeAccountsDao;
import com.tierconnect.entities.AeAccountsEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class AeAccountsService {
    private static AeAccountsDao aeAccountsDao;

    public AeAccountsService() {
        aeAccountsDao = new AeAccountsDao();
    }

    public AeAccountsEntity persist(AeAccountsEntity entity) {
        aeAccountsDao.openCurrentSessionwithTransaction();
        AeAccountsEntity aeAccountsEntity=aeAccountsDao.persist(entity);
        aeAccountsDao.closeCurrentSessionwithTransaction();
        return aeAccountsEntity;
    }

    public void update(AeAccountsEntity entity)
    {
        aeAccountsDao.openCurrentSessionwithTransaction();
        aeAccountsDao.update(entity);
        aeAccountsDao.closeCurrentSessionwithTransaction();
    }

    public AeAccountsEntity findById(Integer id) {
        aeAccountsDao.openCurrentSessionwithTransaction();
        AeAccountsEntity aeAccountsEntity = aeAccountsDao.findById(id);
        aeAccountsDao.closeCurrentSessionwithTransaction();
        return aeAccountsEntity;
    }

    public void delete(Integer id) {
        aeAccountsDao.openCurrentSessionwithTransaction();
        AeAccountsEntity aeAccountsEntity = aeAccountsDao.findById(id);
        aeAccountsDao.delete(aeAccountsEntity);
        aeAccountsDao.closeCurrentSessionwithTransaction();
    }

    public List<AeAccountsEntity> findAll() {
        aeAccountsDao.openCurrentSessionwithTransaction();
        List<AeAccountsEntity> aeAccountsEntities = aeAccountsDao.findAll();
        aeAccountsDao.closeCurrentSessionwithTransaction();
        return aeAccountsEntities;
    }

    public void deleteAll() {
        aeAccountsDao.openCurrentSessionwithTransaction();
        aeAccountsDao.deleteAll();
        aeAccountsDao.closeCurrentSessionwithTransaction();
    }

    public AeAccountsDao aeAccountsDao() {
        return aeAccountsDao;
    }
}
