package com.tierconnect.services;

import com.tierconnect.dao.JsVaChSettingsDao;
import com.tierconnect.entities.JsVaChSettingsEntity;
import com.tierconnect.entities.JsVaChSettingsEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
public class JsVaChSettingsService  {
    private static JsVaChSettingsDao jsVaChSettingsDao;

    public JsVaChSettingsService() {
        jsVaChSettingsDao = new JsVaChSettingsDao();
    }

    public JsVaChSettingsEntity persist(JsVaChSettingsEntity entity) {
        jsVaChSettingsDao.openCurrentSessionwithTransaction();
        JsVaChSettingsEntity JsVaChSettingsEntity=jsVaChSettingsDao.persist(entity);
        jsVaChSettingsDao.closeCurrentSessionwithTransaction();
        return JsVaChSettingsEntity;
    }

    public void update(JsVaChSettingsEntity entity)
    {
        jsVaChSettingsDao.openCurrentSessionwithTransaction();
        jsVaChSettingsDao.update(entity);
        jsVaChSettingsDao.closeCurrentSessionwithTransaction();
    }

    public JsVaChSettingsEntity findById(Integer id) {
        jsVaChSettingsDao.openCurrentSessionwithTransaction();
        JsVaChSettingsEntity jsSettingsEntity = jsVaChSettingsDao.findById(id);
        jsVaChSettingsDao.closeCurrentSessionwithTransaction();
        return jsSettingsEntity;
    }

    public void delete(Integer id) {
        jsVaChSettingsDao.openCurrentSessionwithTransaction();
        JsVaChSettingsEntity jsSettingsEntity = jsVaChSettingsDao.findById(id);
        jsVaChSettingsDao.delete(jsSettingsEntity);
        jsVaChSettingsDao.closeCurrentSessionwithTransaction();
    }

    public List<JsVaChSettingsEntity> findAll() {
        jsVaChSettingsDao.openCurrentSessionwithTransaction();
        List<JsVaChSettingsEntity> jsSettingsEntities = jsVaChSettingsDao.findAll();
        jsVaChSettingsDao.closeCurrentSessionwithTransaction();
        return jsSettingsEntities;
    }

    public void deleteAll() {
        jsVaChSettingsDao.openCurrentSessionwithTransaction();
        jsVaChSettingsDao.deleteAll();
        jsVaChSettingsDao.closeCurrentSessionwithTransaction();
    }

    public JsVaChSettingsDao jsVaChSettingsDao() {
        return jsVaChSettingsDao;
    }
}
