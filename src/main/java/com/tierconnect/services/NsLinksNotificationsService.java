package com.tierconnect.services;

import com.tierconnect.dao.NsLinksNotificationsDao;
import com.tierconnect.entities.NsLinksNotificationsEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class NsLinksNotificationsService {
    private static NsLinksNotificationsDao nsLinksNotificationsService;

    public NsLinksNotificationsService() {
        nsLinksNotificationsService = new NsLinksNotificationsDao();
    }

    public NsLinksNotificationsEntity persist(NsLinksNotificationsEntity entity) {
        nsLinksNotificationsService.openCurrentSessionwithTransaction();
        NsLinksNotificationsEntity nsLinksNotificationsEntity=nsLinksNotificationsService.persist(entity);
        nsLinksNotificationsService.closeCurrentSessionwithTransaction();
        return nsLinksNotificationsEntity;
    }

    public void update(NsLinksNotificationsEntity entity)
    {
        nsLinksNotificationsService.openCurrentSessionwithTransaction();
        nsLinksNotificationsService.update(entity);
        nsLinksNotificationsService.closeCurrentSessionwithTransaction();
    }

    public NsLinksNotificationsEntity findById(String id) {
        nsLinksNotificationsService.openCurrentSessionwithTransaction();
        NsLinksNotificationsEntity nsLinksNotificationsEntity = nsLinksNotificationsService.findById(id);
        nsLinksNotificationsService.closeCurrentSessionwithTransaction();
        return nsLinksNotificationsEntity;
    }

    public void delete(String id) {
        nsLinksNotificationsService.openCurrentSessionwithTransaction();
        NsLinksNotificationsEntity nsLinksNotificationsEntity = nsLinksNotificationsService.findById(id);
        nsLinksNotificationsService.delete(nsLinksNotificationsEntity);
        nsLinksNotificationsService.closeCurrentSessionwithTransaction();
    }

    public List<NsLinksNotificationsEntity> findAll() {
        nsLinksNotificationsService.openCurrentSessionwithTransaction();
        List<NsLinksNotificationsEntity> nsLinksNotificationsEntities = nsLinksNotificationsService.findAll();
        nsLinksNotificationsService.closeCurrentSessionwithTransaction();
        return nsLinksNotificationsEntities;
    }

    public void deleteAll() {
        nsLinksNotificationsService.openCurrentSessionwithTransaction();
        nsLinksNotificationsService.deleteAll();
        nsLinksNotificationsService.closeCurrentSessionwithTransaction();
    }

    public NsLinksNotificationsDao nsLinksNotificationsService() {
        return nsLinksNotificationsService;
    }
}
