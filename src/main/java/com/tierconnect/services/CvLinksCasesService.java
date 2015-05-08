package com.tierconnect.services;

import com.tierconnect.dao.CsLinksCasesDao;
import com.tierconnect.entities.CsLinksCasesEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 30/04/2015.
 */
public class CvLinksCasesService {
    private static CsLinksCasesDao csLinksCasesDao;
    public CvLinksCasesService(){
        csLinksCasesDao=new CsLinksCasesDao();
    }
    public CsLinksCasesEntity persist(CsLinksCasesEntity entity){
        csLinksCasesDao.openCurrentSessionwithTransaction();
        CsLinksCasesEntity csLinksCasesEntity=csLinksCasesDao.persist(entity);
        csLinksCasesDao.closeCurrentSessionwithTransaction();
        return csLinksCasesEntity;
    }
    public void update(CsLinksCasesEntity entity) {
        csLinksCasesDao.openCurrentSessionwithTransaction();
        csLinksCasesDao.update(entity);
        csLinksCasesDao.closeCurrentSessionwithTransaction();
    }

    public CsLinksCasesEntity findById(String id) {
        csLinksCasesDao.openCurrentSession();
        CsLinksCasesEntity book =csLinksCasesDao.findById(id);
        csLinksCasesDao.closeCurrentSession();
        return book;
    }

    public void delete(String id) {
        csLinksCasesDao.openCurrentSessionwithTransaction();
        CsLinksCasesEntity csLinksCasesEntity = csLinksCasesDao.findById(id);
        csLinksCasesDao.delete(csLinksCasesEntity);
        csLinksCasesDao.closeCurrentSessionwithTransaction();
    }

    public List<CsLinksCasesEntity> findAll() {
        csLinksCasesDao.openCurrentSession();
        List<CsLinksCasesEntity> books =csLinksCasesDao.findAll();
        csLinksCasesDao.closeCurrentSession();
        return books;
    }

    public void deleteAll() {
        csLinksCasesDao.openCurrentSessionwithTransaction();
        csLinksCasesDao.deleteAll();
        csLinksCasesDao.closeCurrentSessionwithTransaction();
    }

    public CsLinksCasesDao bookDao() {
        return csLinksCasesDao;
    }

}
