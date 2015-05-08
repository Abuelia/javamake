package com.tierconnect.services;

import com.tierconnect.dao.VaLinksChecksDao;
import com.tierconnect.entities.VaLinksChecksEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class VaLinksChecksService{
    private static VaLinksChecksDao vaLinksChecksDao;
    public VaLinksChecksService(){
        vaLinksChecksDao=new VaLinksChecksDao();
    }
    public VaLinksChecksEntity persist(VaLinksChecksEntity entity){
        vaLinksChecksDao.openCurrentSessionwithTransaction();
        VaLinksChecksEntity vaLinksChecksEntity=vaLinksChecksDao.persist(entity);
        vaLinksChecksDao.closeCurrentSessionwithTransaction();
        return vaLinksChecksEntity;
    }
    public void update(VaLinksChecksEntity entity) {
        vaLinksChecksDao.openCurrentSessionwithTransaction();
        vaLinksChecksDao.update(entity);
        vaLinksChecksDao.closeCurrentSessionwithTransaction();
    }

    public VaLinksChecksEntity findById(String id) {
        vaLinksChecksDao.openCurrentSession();
        VaLinksChecksEntity vaLinksChecksEntity =vaLinksChecksDao.findById(id);
        vaLinksChecksDao.closeCurrentSession();
        return vaLinksChecksEntity;
    }

    public void delete(String id) {
        vaLinksChecksDao.openCurrentSessionwithTransaction();
        VaLinksChecksEntity vaLinksChecksEntity = vaLinksChecksDao.findById(id);
        vaLinksChecksDao.delete(vaLinksChecksEntity);
        vaLinksChecksDao.closeCurrentSessionwithTransaction();
    }

    public List<VaLinksChecksEntity> findAll() {
        vaLinksChecksDao.openCurrentSession();
        List<VaLinksChecksEntity> vaLinksChecksEntities =vaLinksChecksDao.findAll();
        vaLinksChecksDao.closeCurrentSession();
        return vaLinksChecksEntities;
    }

    public void deleteAll() {
        vaLinksChecksDao.openCurrentSessionwithTransaction();
        vaLinksChecksDao.deleteAll();
        vaLinksChecksDao.closeCurrentSessionwithTransaction();
    }

    public VaLinksChecksDao vaLinksChecksDao() {
        return vaLinksChecksDao;
    }
}
