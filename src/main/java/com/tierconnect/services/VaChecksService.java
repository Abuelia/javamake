package com.tierconnect.services;

import com.tierconnect.dao.VaChecksDao;
import com.tierconnect.entities.VaChecksEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class VaChecksService {
    private static VaChecksDao vaChecksDao;

    public VaChecksService() {
        vaChecksDao = new VaChecksDao();
    }

    public VaChecksEntity persist(VaChecksEntity entity) {
        vaChecksDao.openCurrentSessionwithTransaction();
        VaChecksEntity vaChecksEntity=vaChecksDao.persist(entity);
        vaChecksDao.closeCurrentSessionwithTransaction();
        return vaChecksEntity;
    }

    public void update(VaChecksEntity entity)
    {
        vaChecksDao.openCurrentSessionwithTransaction();
        vaChecksDao.update(entity);
        vaChecksDao.closeCurrentSessionwithTransaction();
    }

    public VaChecksEntity findById(String id) {
        vaChecksDao.openCurrentSessionwithTransaction();
        VaChecksEntity vaChecksEntity = vaChecksDao.findById(id);
        vaChecksDao.closeCurrentSessionwithTransaction();
        return vaChecksEntity;
    }

    public void delete(String id) {
        vaChecksDao.openCurrentSessionwithTransaction();
        VaChecksEntity JsListsEntity = vaChecksDao.findById(id);
        vaChecksDao.delete(JsListsEntity);
        vaChecksDao.closeCurrentSessionwithTransaction();
    }

    public List<VaChecksEntity> findAll() {
        vaChecksDao.openCurrentSessionwithTransaction();
        List<VaChecksEntity> vaChecksEntities = vaChecksDao.findAll();
        vaChecksDao.closeCurrentSessionwithTransaction();
        return vaChecksEntities;
    }

    public void deleteAll() {
        vaChecksDao.openCurrentSessionwithTransaction();
        vaChecksDao.deleteAll();
        vaChecksDao.closeCurrentSessionwithTransaction();
    }

    public VaChecksDao vaChecksDao() {
        return vaChecksDao;
    }
}
