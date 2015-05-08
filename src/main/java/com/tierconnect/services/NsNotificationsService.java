package com.tierconnect.services;

import com.tierconnect.dao.NsNotificationsDao;
import com.tierconnect.entities.NsNotificationsEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class NsNotificationsService {
    private static NsNotificationsDao nsNotificationsDao;

    public NsNotificationsService() {
        nsNotificationsDao = new NsNotificationsDao();
    }

    public NsNotificationsEntity persist(NsNotificationsEntity entity) {
        nsNotificationsDao.openCurrentSessionwithTransaction();
        NsNotificationsEntity nsNotificationsEntity=nsNotificationsDao.persist(entity);
        nsNotificationsDao.closeCurrentSessionwithTransaction();
        return nsNotificationsEntity;
    }

    public void update(NsNotificationsEntity entity)
    {
        nsNotificationsDao.openCurrentSessionwithTransaction();
        nsNotificationsDao.update(entity);
        nsNotificationsDao.closeCurrentSessionwithTransaction();
    }

    public NsNotificationsEntity findById(String id) {
        nsNotificationsDao.openCurrentSessionwithTransaction();
        NsNotificationsEntity nsNotificationsEntity = nsNotificationsDao.findById(id);
        nsNotificationsDao.closeCurrentSessionwithTransaction();
        return nsNotificationsEntity;
    }

    public void delete(String id) {
        nsNotificationsDao.openCurrentSessionwithTransaction();
        NsNotificationsEntity nsNotificationsEntity = nsNotificationsDao.findById(id);
        nsNotificationsDao.delete(nsNotificationsEntity);
        nsNotificationsDao.closeCurrentSessionwithTransaction();
    }

    public List<NsNotificationsEntity> findAll() {
        nsNotificationsDao.openCurrentSessionwithTransaction();
        List<NsNotificationsEntity> nsNotificationsEntities = nsNotificationsDao.findAll();
        nsNotificationsDao.closeCurrentSessionwithTransaction();
        return nsNotificationsEntities;
    }

    public void deleteAll() {
        nsNotificationsDao.openCurrentSessionwithTransaction();
        nsNotificationsDao.deleteAll();
        nsNotificationsDao.closeCurrentSessionwithTransaction();
    }

    public NsNotificationsDao nsNotificationsDao() {
        return nsNotificationsDao;
    }
}
