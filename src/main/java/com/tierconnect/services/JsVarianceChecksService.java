package com.tierconnect.services;

import com.tierconnect.dao.JsVarianceChecksDao;
import com.tierconnect.entities.JsVarianceChecksEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
public class JsVarianceChecksService {
    private static JsVarianceChecksDao jsVarianceChecksDao;

    public JsVarianceChecksService() {
        jsVarianceChecksDao = new JsVarianceChecksDao();
    }

    public JsVarianceChecksEntity persist(JsVarianceChecksEntity entity) {
        jsVarianceChecksDao.openCurrentSessionwithTransaction();
        JsVarianceChecksEntity JsVarianceChecksEntity=jsVarianceChecksDao.persist(entity);
        jsVarianceChecksDao.closeCurrentSessionwithTransaction();
        return JsVarianceChecksEntity;
    }

    public void update(JsVarianceChecksEntity entity)
    {
        jsVarianceChecksDao.openCurrentSessionwithTransaction();
        jsVarianceChecksDao.update(entity);
        jsVarianceChecksDao.closeCurrentSessionwithTransaction();
    }

    public JsVarianceChecksEntity findById(Integer id) {
        jsVarianceChecksDao.openCurrentSessionwithTransaction();
        JsVarianceChecksEntity jsListsEntity = jsVarianceChecksDao.findById(id);
        jsVarianceChecksDao.closeCurrentSessionwithTransaction();
        return jsListsEntity;
    }

    public void delete(Integer id) {
        jsVarianceChecksDao.openCurrentSessionwithTransaction();
        JsVarianceChecksEntity JsVarianceChecksEntity = jsVarianceChecksDao.findById(id);
        jsVarianceChecksDao.delete(JsVarianceChecksEntity);
        jsVarianceChecksDao.closeCurrentSessionwithTransaction();
    }

    public List<JsVarianceChecksEntity> findAll() {
        jsVarianceChecksDao.openCurrentSessionwithTransaction();
        List<JsVarianceChecksEntity> jsJobsEntities = jsVarianceChecksDao.findAll();
        jsVarianceChecksDao.closeCurrentSessionwithTransaction();
        return jsJobsEntities;
    }

    public void deleteAll() {
        jsVarianceChecksDao.openCurrentSessionwithTransaction();
        jsVarianceChecksDao.deleteAll();
        jsVarianceChecksDao.closeCurrentSessionwithTransaction();
    }

    public JsVarianceChecksDao jsVarianceChecksDao() {
        return jsVarianceChecksDao;
    }
    public List<JsVarianceChecksEntity> getVarianceChecks(){
        jsVarianceChecksDao.openCurrentSessionwithTransaction();
        List<JsVarianceChecksEntity> jsVarianceChecksEntities=jsVarianceChecksDao.getVarianceChecks();
        jsVarianceChecksDao.closeCurrentSessionwithTransaction();
        return jsVarianceChecksEntities;
    }
}
