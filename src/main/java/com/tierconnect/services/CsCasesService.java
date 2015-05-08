package com.tierconnect.services;

import com.tierconnect.dao.CsCasesDao;
import com.tierconnect.entities.CsCasesEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class CsCasesService {
    private static CsCasesDao csCasesDao;
    public CsCasesService(){
        csCasesDao=new CsCasesDao();
    }
    public CsCasesEntity persist(CsCasesEntity entity){
        csCasesDao.openCurrentSessionwithTransaction();
        CsCasesEntity csCasesEntity=csCasesDao.persist(entity);
        csCasesDao.closeCurrentSessionwithTransaction();
        return csCasesEntity;
    }
    public void update(CsCasesEntity entity) {
        csCasesDao.openCurrentSessionwithTransaction();
        csCasesDao.update(entity);
        csCasesDao.closeCurrentSessionwithTransaction();
    }

    public CsCasesEntity findById(String id) {
        csCasesDao.openCurrentSession();
        CsCasesEntity csCasesEntity =csCasesDao.findById(id);
        csCasesDao.closeCurrentSession();
        return csCasesEntity;
    }

    public void delete(String id) {
        csCasesDao.openCurrentSessionwithTransaction();
        CsCasesEntity csCasesEntity = csCasesDao.findById(id);
        csCasesDao.delete(csCasesEntity);
        csCasesDao.closeCurrentSessionwithTransaction();
    }

    public List<CsCasesEntity> findAll() {
        csCasesDao.openCurrentSession();
        List<CsCasesEntity> csCasesEntities =csCasesDao.findAll();
        csCasesDao.closeCurrentSession();
        return csCasesEntities;
    }

    public void deleteAll() {
        csCasesDao.openCurrentSessionwithTransaction();
        csCasesDao.deleteAll();
        csCasesDao.closeCurrentSessionwithTransaction();
    }

    public CsCasesDao bookDao() {
        return csCasesDao;
    }
}
