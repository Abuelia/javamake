package com.tierconnect.utilities;


import com.github.mirreck.FakeFactory;
import com.tierconnect.dao.JsVaChSettingsDao;
import com.tierconnect.entities.*;
import com.tierconnect.services.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by PC on 27/04/2015.
 */
public class Main {
    private static String status[]={"Active","Inactive","Inprogress"};
    private static FakeFactory factory=new FakeFactory();
    public static void main(String args[]){

        createdJobs(1);
        System.out.println("end");
/*

            try
            {
                    Configuration cfg = new Configuration().configure();
                    new SchemaExport(cfg).create(true, true);
            }
            catch(Exception e)
            {
                    System.out.println("error");
                    System.out.println(e);
            }*/
    }
    public static void createdJobs(int numJobs){
        RandomDate randomDate=new RandomDate();
        System.out.println(new Date(randomDate.getRandomTimeBetweenTwoDates()));
        FakeFactory factory = new FakeFactory();
        AeUsersService aeUsersService=new AeUsersService();
        List<AeUsersEntity> userList = aeUsersService.findAll();
        JsJobsService jsJobsService=new JsJobsService();
        for(int i=0;i<numJobs;i++){
                    int randomuser=(int)(Math.random()*userList.size());
                    JsJobsEntity jsJobsEntity=new JsJobsEntity();
                    jsJobsEntity.setBaseurl("https://bankofamerica.com");
                    jsJobsEntity.setPublicId(factory.letters(3) + factory.digits(3));
                    jsJobsEntity.setAccountId(userList.get(randomuser).getAccountId());
                    jsJobsEntity.setStatus(status[((int) (Math.random() * 3)) % 3]);
                    long datestart=randomDate.getRandomTimeBetweenTwoDates();
                    jsJobsEntity.setCreatedAt(new Timestamp(datestart));
                    jsJobsEntity.setUpdatedAt(new Timestamp(randomDate.getRandomTimeBetweenTwoDates(datestart)));
                    jsJobsEntity.setOwnerUserId(userList.get(randomuser).getId());
                   jsJobsEntity= jsJobsService.persist(jsJobsEntity);
                    createdListJobs((int)(Math.random()*5),userList,jsJobsEntity.getId());
                    createVariance(jsJobsEntity.getId(),jsJobsEntity.getOwnerUserId());
                System.out.println(jsJobsEntity.getId());
        }
    }
    public static void createdListJobs(int sizeList,List<AeUsersEntity> userList,int jobId){
        JsListsService jsListsService=new JsListsService();
        for (int i=0;i<sizeList;i++){
            int randomuser=(int)(Math.random()*userList.size());
            JsListsEntity jsListsEntity=new JsListsEntity();
            jsListsEntity.setUserId((long) userList.get(randomuser).getId());
            jsListsEntity.setAclId((((int) (Math.random() * 3)) % 3 + 1) * 10);
            jsListsEntity.setJobId(jobId);
            jsListsEntity.setName(userList.get(randomuser).getFirstName());
            jsListsService.persist(jsListsEntity);
        }
    }
    public static void createVariance(int jobId,int userId){
        RandomDate randomDate=new RandomDate();
            JsVarianceChecksService jsVarianceChecksService=new JsVarianceChecksService();
            JsVarianceChecksEntity jsVarianceChecksEntity=new JsVarianceChecksEntity();
            jsVarianceChecksEntity.setJobId(jobId);
            jsVarianceChecksEntity.setUserId(userId);
            int dayRandom=(int)(Math.random()*6);
            jsVarianceChecksEntity.setFrequencyId(dayRandom);
        long datestart=randomDate.getRandomTimeBetweenTwoDates();
        jsVarianceChecksEntity.setStartDtctime( datestart);
        jsVarianceChecksEntity.setDueDtctime( randomDate.getRandomTimeBetweenTwoDates(datestart));
        jsVarianceChecksEntity.setCompletionCtime((long) 1);
        jsVarianceChecksEntity.setName(factory.name());
        jsVarianceChecksEntity.setStartDtctime( datestart);
            jsVarianceChecksEntity.setStatus(status[((int) (Math.random() * 3)) % 3]);
            if(jsVarianceChecksEntity.getFrequencyId()==3){
                jsVarianceChecksEntity.setMonday((Math.random()>0.5)?(short)1:(short)0);
                jsVarianceChecksEntity.setTuesday((Math.random() > 0.5) ? (short) 1 : (short) 0);
                jsVarianceChecksEntity.setWednesday((Math.random()>0.5)?(short)1:(short)0);
                jsVarianceChecksEntity.setThursday((Math.random()>0.5)?(short)1:(short)0);
                jsVarianceChecksEntity.setFriday((Math.random()>0.5)?(short)1:(short)0);
                jsVarianceChecksEntity.setSaturday((Math.random()>0.5)?(short)1:(short)0);
                jsVarianceChecksEntity.setSunday((Math.random()>0.5)?(short)1:(short)0);
            }
        jsVarianceChecksService.persist(jsVarianceChecksEntity);
            createVaChSetting(jsVarianceChecksEntity.getId(),1);
    }
    public static void createVaChSetting(int va_ch_settings,int ssize_id){
        JsVaChSettingsService jsVaChSettingsService=new JsVaChSettingsService();
        JsVaChSettingsEntity jsVaChSettingsEntity=new JsVaChSettingsEntity();
        jsVaChSettingsEntity.setVaChId(va_ch_settings);
        jsVaChSettingsEntity.setSsSizeId(ssize_id);
        jsVaChSettingsService.persist(jsVaChSettingsEntity);
    }
}
