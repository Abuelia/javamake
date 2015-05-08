package com.tierconnect.services;

import com.tierconnect.dao.VaVariancesDao;
import com.tierconnect.entities.VaVariancesEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class VaVariancesService {
    private static VaVariancesDao vaVariancesDao;
    public VaVariancesService(){
        vaVariancesDao=new VaVariancesDao();
    }
    public VaVariancesEntity persist(VaVariancesEntity entity){
        vaVariancesDao.openCurrentSessionwithTransaction();
        VaVariancesEntity vaVariancesEntity=vaVariancesDao.persist(entity);
        vaVariancesDao.closeCurrentSessionwithTransaction();
        return vaVariancesEntity;
    }
    public void update(VaVariancesEntity entity) {
        vaVariancesDao.openCurrentSessionwithTransaction();
        vaVariancesDao.update(entity);
        vaVariancesDao.closeCurrentSessionwithTransaction();
    }

    public VaVariancesEntity findById(String id) {
        vaVariancesDao.openCurrentSession();
        VaVariancesEntity vaVariancesEntity =vaVariancesDao.findById(id);
        vaVariancesDao.closeCurrentSession();
        return vaVariancesEntity;
    }

    public void delete(String id) {
        vaVariancesDao.openCurrentSessionwithTransaction();
        VaVariancesEntity vaVariancesEntity = vaVariancesDao.findById(id);
        vaVariancesDao.delete(vaVariancesEntity);
        vaVariancesDao.closeCurrentSessionwithTransaction();
    }

    public List<VaVariancesEntity> findAll() {
        vaVariancesDao.openCurrentSession();
        List<VaVariancesEntity> vaVariancesEntities =vaVariancesDao.findAll();
        vaVariancesDao.closeCurrentSession();
        return vaVariancesEntities;
    }

    public void deleteAll() {
        vaVariancesDao.openCurrentSessionwithTransaction();
        vaVariancesDao.deleteAll();
        vaVariancesDao.closeCurrentSessionwithTransaction();
    }

    public VaVariancesDao vaVariancesDao() {
        return vaVariancesDao;
    }
}
