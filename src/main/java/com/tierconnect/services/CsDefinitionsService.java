package com.tierconnect.services;

import com.tierconnect.dao.CsDefinitionsDao;
import com.tierconnect.entities.CsDefinitionsEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class CsDefinitionsService {
    private static CsDefinitionsDao csDefinitionsDao;
    public CsDefinitionsService(){
        csDefinitionsDao=new CsDefinitionsDao();
    }
    public CsDefinitionsEntity persist(CsDefinitionsEntity entity){
        csDefinitionsDao.openCurrentSessionwithTransaction();
        CsDefinitionsEntity csDefinitionsEntity=csDefinitionsDao.persist(entity);
        csDefinitionsDao.closeCurrentSessionwithTransaction();
        return csDefinitionsEntity;
    }
    public void update(CsDefinitionsEntity entity) {
        csDefinitionsDao.openCurrentSessionwithTransaction();
        csDefinitionsDao.update(entity);
        csDefinitionsDao.closeCurrentSessionwithTransaction();
    }

    public CsDefinitionsEntity findById(String id) {
        csDefinitionsDao.openCurrentSession();
        CsDefinitionsEntity csDefinitionsEntity =csDefinitionsDao.findById(id);
        csDefinitionsDao.closeCurrentSession();
        return csDefinitionsEntity;
    }

    public void delete(String id) {
        csDefinitionsDao.openCurrentSessionwithTransaction();
        CsDefinitionsEntity csDefinitionsEntity = csDefinitionsDao.findById(id);
        csDefinitionsDao.delete(csDefinitionsEntity);
        csDefinitionsDao.closeCurrentSessionwithTransaction();
    }

    public List<CsDefinitionsEntity> findAll() {
        csDefinitionsDao.openCurrentSession();
        List<CsDefinitionsEntity> csDefinitionsEntities =csDefinitionsDao.findAll();
        csDefinitionsDao.closeCurrentSession();
        return csDefinitionsEntities;
    }

    public void deleteAll() {
        csDefinitionsDao.openCurrentSessionwithTransaction();
        csDefinitionsDao.deleteAll();
        csDefinitionsDao.closeCurrentSessionwithTransaction();
    }

    public CsDefinitionsDao bookDao() {
        return csDefinitionsDao;
    }
}
