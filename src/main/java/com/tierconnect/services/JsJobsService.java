package com.tierconnect.services;

import com.tierconnect.dao.JsJobsDao;
import com.tierconnect.entities.JsJobsEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul landaeta on 28/04/2015.
 */
public class JsJobsService {
    private static JsJobsDao jsJobsDao;

    public JsJobsService() {
        jsJobsDao = new JsJobsDao();
    }

    public JsJobsEntity persist(JsJobsEntity entity) {
        jsJobsDao.openCurrentSessionwithTransaction();
        JsJobsEntity jsJobsEntity=jsJobsDao.persist(entity);
        jsJobsDao.closeCurrentSessionwithTransaction();
        return jsJobsEntity;
    }

    public void update(JsJobsEntity entity)
    {
        jsJobsDao.openCurrentSessionwithTransaction();
        jsJobsDao.update(entity);
        jsJobsDao.closeCurrentSessionwithTransaction();
    }

    public JsJobsEntity findById(Integer id) {
        jsJobsDao.openCurrentSessionwithTransaction();
        JsJobsEntity jsJobsEntity = jsJobsDao.findById(id);
        jsJobsDao.closeCurrentSessionwithTransaction();
        return jsJobsEntity;
    }

    public void delete(Integer id) {
        jsJobsDao.openCurrentSessionwithTransaction();
        JsJobsEntity jsJobsEntity = jsJobsDao.findById(id);
        jsJobsDao.delete(jsJobsEntity);
        jsJobsDao.closeCurrentSessionwithTransaction();
    }

    public List<JsJobsEntity> findAll() {
        jsJobsDao.openCurrentSessionwithTransaction();
        List<JsJobsEntity> jsJobsEntities = jsJobsDao.findAll();
        jsJobsDao.closeCurrentSessionwithTransaction();
        return jsJobsEntities;
    }

    public void deleteAll() {
        jsJobsDao.openCurrentSessionwithTransaction();
        jsJobsDao.deleteAll();
        jsJobsDao.closeCurrentSessionwithTransaction();
    }

    public JsJobsDao jsJobsDao() {
        return jsJobsDao;
    }
    public JsJobsEntity findByPublicId(String publicId)
    {
        jsJobsDao.openCurrentSessionwithTransaction();
        JsJobsEntity jsJobsEntity=jsJobsDao.findbyPublicId(publicId);
        jsJobsDao.closeCurrentSessionwithTransaction();
        return jsJobsEntity;
    }
    public List<JsJobsEntity> findJobs(List<String> publicID){
        List<JsJobsEntity> jsJobsEntities=new ArrayList<>();
        for(String ID:publicID){
            jsJobsEntities.add(findByPublicId(ID));
        }
        return jsJobsEntities;
    }
}
