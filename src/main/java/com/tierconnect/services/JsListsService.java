package com.tierconnect.services;

import com.tierconnect.dao.JsListDao;
import com.tierconnect.entities.JsListsEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 04/05/2015.
 */
public class JsListsService {
    private static JsListDao jsListDao;

    public JsListsService() {
        jsListDao = new JsListDao();
    }

    public JsListsEntity persist(JsListsEntity entity) {
        jsListDao.openCurrentSessionwithTransaction();
        JsListsEntity JsListsEntity=jsListDao.persist(entity);
        jsListDao.closeCurrentSessionwithTransaction();
        return JsListsEntity;
    }

    public void update(JsListsEntity entity)
    {
        jsListDao.openCurrentSessionwithTransaction();
        jsListDao.update(entity);
        jsListDao.closeCurrentSessionwithTransaction();
    }

    public JsListsEntity findById(Integer id) {
        jsListDao.openCurrentSessionwithTransaction();
        JsListsEntity jsListsEntity = jsListDao.findById(id);
        jsListDao.closeCurrentSessionwithTransaction();
        return jsListsEntity;
    }

    public void delete(Integer id) {
        jsListDao.openCurrentSessionwithTransaction();
        JsListsEntity JsListsEntity = jsListDao.findById(id);
        jsListDao.delete(JsListsEntity);
        jsListDao.closeCurrentSessionwithTransaction();
    }

    public List<JsListsEntity> findAll() {
        jsListDao.openCurrentSessionwithTransaction();
        List<JsListsEntity> jsJobsEntities = jsListDao.findAll();
        jsListDao.closeCurrentSessionwithTransaction();
        return jsJobsEntities;
    }

    public void deleteAll() {
        jsListDao.openCurrentSessionwithTransaction();
        jsListDao.deleteAll();
        jsListDao.closeCurrentSessionwithTransaction();
    }

    public JsListDao jsListDao() {
        return jsListDao;
    }
}
