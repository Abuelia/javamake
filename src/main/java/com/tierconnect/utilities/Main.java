package com.tierconnect.utilities;


import com.github.mirreck.FakeFactory;
import com.tierconnect.entities.*;
import com.tierconnect.services.AeUsersService;
import com.tierconnect.services.JsJobsService;
import com.tierconnect.services.JsSettingsService;
import com.tierconnect.services.JsVarianceChecksService;

import java.util.List;

/**
 * Created by PC on 27/04/2015.
 */
public class Main {
    public static void main(String args[]){
        FakeFactory factory = new FakeFactory();
        AeUsersService aeUsersService=new AeUsersService();

        List<AeUsersEntity> UserList = aeUsersService.findAll();
//        System.out.println(UserList.size());
//
//            JsJobsService jsJobsService=new JsJobsService();
//
//            for(int i=0;i<500;i++){
//                    int randomuser=(int)(Math.random()*UserList.size());
//                    System.out.println(randomuser + "random number");
//                    JsJobsEntity jsJobsEntity=new JsJobsEntity();
//                    jsJobsEntity.setBaseurl("https://bankofamerica.com");
//                    jsJobsEntity.setPublicId(factory.letters(3) + factory.digits(3));
//                    jsJobsEntity.setAccountId(UserList.get(randomuser).getAccountId());
//                    jsJobsService.persist(jsJobsEntity);
//                System.out.println(jsJobsEntity.getId());
//            }
//        JsVarianceChecksService jsVarianceChecksService=new JsVarianceChecksService();
//        for(int i=0;i<500;i++){
//            int randomuser=(int)(Math.random()*UserList.size());
//            JsVarianceChecksEntity jsVarianceChecksEntity=new JsVarianceChecksEntity();
//            jsVarianceChecksEntity.setJobId((int) (Math.random() * 500));
//            jsVarianceChecksEntity.setUserId(UserList.get(randomuser).getId());
//            int dayRandom=(int)(Math.random()*6);
//            jsVarianceChecksEntity.setFrequencyId(dayRandom);
//            jsVarianceChecksEntity.setStartDtctime( factory.date(2015, 2016).getTime());
//            jsVarianceChecksEntity.setDueDtctime( factory.date(2015, 2016).getTime());
//            jsVarianceChecksEntity.setCompletionCtime((long) 1);
//            jsVarianceChecksEntity.setName(factory.name());
//            jsVarianceChecksEntity.setStartDtctime( factory.date(2015, 2016).getTime());
//            jsVarianceChecksEntity.setStatus("ACTIVE");
//            if(jsVarianceChecksEntity.getFrequencyId()==3){
//                jsVarianceChecksEntity.setMonday((Math.random()>0.5)?(short)1:(short)0);
//                jsVarianceChecksEntity.setTuesday((Math.random() > 0.5) ? (short) 1 : (short) 0);
//                jsVarianceChecksEntity.setWednesday((Math.random()>0.5)?(short)1:(short)0);
//                jsVarianceChecksEntity.setThursday((Math.random()>0.5)?(short)1:(short)0);
//                jsVarianceChecksEntity.setFriday((Math.random()>0.5)?(short)1:(short)0);
//                jsVarianceChecksEntity.setSaturday((Math.random()>0.5)?(short)1:(short)0);
//                jsVarianceChecksEntity.setSunday((Math.random()>0.5)?(short)1:(short)0);
//            }
//            jsVarianceChecksService.persist(jsVarianceChecksEntity);
//        }

//        JsVarianceChecksService jsVarianceChecksService=new JsVarianceChecksService();
//        List<JsVarianceChecksEntity> js=jsVarianceChecksService.getVarianceChecks();
//        for(JsVarianceChecksEntity entity:js){
//            System.out.println(entity.getStartDtctime());
//        }
        JsSettingsService jsSettingsService=new JsSettingsService();
        for(int i=95;i<200;i++){
            int randomuser=(int)(Math.random()*UserList.size());
            JsSettingsEntity jsSettingsEntity=new JsSettingsEntity();
            jsSettingsEntity.setUserId(UserList.get(i).getId());
            jsSettingsEntity.setEmailRedirectNotification("ariel.quiroz@coderoad.com");
            jsSettingsEntity.setEmailMuteNotification((Math.random() > 0.5) ? (short) 1 : (short) 0);
            jsSettingsEntity.setSmsMuteNotification((short)0);
            jsSettingsService.persist(jsSettingsEntity);
        }
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
}
