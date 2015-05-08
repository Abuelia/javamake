package com.tierconnect.services;

import com.tierconnect.dao.JsSettingsDao;
import com.tierconnect.entities.JsSettingsEntity;

import java.util.List;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
public class JsSettingsService {
    private static JsSettingsDao jsSettingsDao;

    public JsSettingsService() {
        jsSettingsDao = new JsSettingsDao();
    }

    public JsSettingsEntity persist(JsSettingsEntity entity) {
        jsSettingsDao.openCurrentSessionwithTransaction();
        JsSettingsEntity JsSettingsEntity=jsSettingsDao.persist(entity);
        jsSettingsDao.closeCurrentSessionwithTransaction();
        return JsSettingsEntity;
    }

    public void update(JsSettingsEntity entity)
    {
        jsSettingsDao.openCurrentSessionwithTransaction();
        jsSettingsDao.update(entity);
        jsSettingsDao.closeCurrentSessionwithTransaction();
    }

    public JsSettingsEntity findById(Integer id) {
        jsSettingsDao.openCurrentSessionwithTransaction();
        JsSettingsEntity jsSettingsEntity = jsSettingsDao.findById(id);
        jsSettingsDao.closeCurrentSessionwithTransaction();
        return jsSettingsEntity;
    }

    public void delete(Integer id) {
        jsSettingsDao.openCurrentSessionwithTransaction();
        JsSettingsEntity jsSettingsEntity = jsSettingsDao.findById(id);
        jsSettingsDao.delete(jsSettingsEntity);
        jsSettingsDao.closeCurrentSessionwithTransaction();
    }

    public List<JsSettingsEntity> findAll() {
        jsSettingsDao.openCurrentSessionwithTransaction();
        List<JsSettingsEntity> jsSettingsEntities = jsSettingsDao.findAll();
        jsSettingsDao.closeCurrentSessionwithTransaction();
        return jsSettingsEntities;
    }

    public void deleteAll() {
        jsSettingsDao.openCurrentSessionwithTransaction();
        jsSettingsDao.deleteAll();
        jsSettingsDao.closeCurrentSessionwithTransaction();
    }

    public JsSettingsDao jsSettingsDao() {
        return jsSettingsDao;
    }
}
