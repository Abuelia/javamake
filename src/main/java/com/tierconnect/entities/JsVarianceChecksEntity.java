package com.tierconnect.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@javax.persistence.Table(name = "js_variance_checks", schema = "", catalog = "tcnotifications")
public class JsVarianceChecksEntity {
    private int id;

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int jobId;

    @Basic
    @javax.persistence.Column(name = "job_id")
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    private String uuid;

    @Basic
    @javax.persistence.Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    private Integer userId;

    @Basic
    @javax.persistence.Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private Integer frequencyId;

    @Basic
    @javax.persistence.Column(name = "frequency_id")
    public Integer getFrequencyId() {
        return frequencyId;
    }

    public void setFrequencyId(Integer frequencyId) {
        this.frequencyId = frequencyId;
    }

    private Long startDtctime;

    @Basic
    @javax.persistence.Column(name = "start_dtctime")
    public Long getStartDtctime() {
        return startDtctime;
    }

    public void setStartDtctime(Long startDtctime) {
        this.startDtctime = startDtctime;
    }

    private Long dueDtctime;

    @Basic
    @javax.persistence.Column(name = "due_dtctime")
    public Long getDueDtctime() {
        return dueDtctime;
    }

    public void setDueDtctime(Long dueDtctime) {
        this.dueDtctime = dueDtctime;
    }

    private Long completionCtime;

    @Basic
    @javax.persistence.Column(name = "completion_ctime")
    public Long getCompletionCtime() {
        return completionCtime;
    }

    public void setCompletionCtime(Long completionCtime) {
        this.completionCtime = completionCtime;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Long startCtime;

    @Basic
    @javax.persistence.Column(name = "start_ctime")
    public Long getStartCtime() {
        return startCtime;
    }

    public void setStartCtime(Long startCtime) {
        this.startCtime = startCtime;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Integer everyDh;

    @Basic
    @javax.persistence.Column(name = "every_dh")
    public Integer getEveryDh() {
        return everyDh;
    }

    public void setEveryDh(Integer everyDh) {
        this.everyDh = everyDh;
    }

    private Short monday;

    @Basic
    @javax.persistence.Column(name = "monday")
    public Short getMonday() {
        return monday;
    }

    public void setMonday(Short monday) {
        this.monday = monday;
    }

    private Short tuesday;

    @Basic
    @javax.persistence.Column(name = "tuesday")
    public Short getTuesday() {
        return tuesday;
    }

    public void setTuesday(Short tuesday) {
        this.tuesday = tuesday;
    }

    private Short wednesday;

    @Basic
    @javax.persistence.Column(name = "wednesday")
    public Short getWednesday() {
        return wednesday;
    }

    public void setWednesday(Short wednesday) {
        this.wednesday = wednesday;
    }

    private Short thursday;

    @Basic
    @javax.persistence.Column(name = "thursday")
    public Short getThursday() {
        return thursday;
    }

    public void setThursday(Short thursday) {
        this.thursday = thursday;
    }

    private Short friday;

    @Basic
    @javax.persistence.Column(name = "friday")
    public Short getFriday() {
        return friday;
    }

    public void setFriday(Short friday) {
        this.friday = friday;
    }

    private Short saturday;

    @Basic
    @javax.persistence.Column(name = "saturday")
    public Short getSaturday() {
        return saturday;
    }

    public void setSaturday(Short saturday) {
        this.saturday = saturday;
    }

    private Short sunday;

    @Basic
    @javax.persistence.Column(name = "sunday")
    public Short getSunday() {
        return sunday;
    }

    public void setSunday(Short sunday) {
        this.sunday = sunday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsVarianceChecksEntity that = (JsVarianceChecksEntity) o;

        if (id != that.id) return false;
        if (jobId != that.jobId) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (frequencyId != null ? !frequencyId.equals(that.frequencyId) : that.frequencyId != null) return false;
        if (startDtctime != null ? !startDtctime.equals(that.startDtctime) : that.startDtctime != null) return false;
        if (dueDtctime != null ? !dueDtctime.equals(that.dueDtctime) : that.dueDtctime != null) return false;
        if (completionCtime != null ? !completionCtime.equals(that.completionCtime) : that.completionCtime != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (startCtime != null ? !startCtime.equals(that.startCtime) : that.startCtime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (everyDh != null ? !everyDh.equals(that.everyDh) : that.everyDh != null) return false;
        if (monday != null ? !monday.equals(that.monday) : that.monday != null) return false;
        if (tuesday != null ? !tuesday.equals(that.tuesday) : that.tuesday != null) return false;
        if (wednesday != null ? !wednesday.equals(that.wednesday) : that.wednesday != null) return false;
        if (thursday != null ? !thursday.equals(that.thursday) : that.thursday != null) return false;
        if (friday != null ? !friday.equals(that.friday) : that.friday != null) return false;
        if (saturday != null ? !saturday.equals(that.saturday) : that.saturday != null) return false;
        if (sunday != null ? !sunday.equals(that.sunday) : that.sunday != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + jobId;
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (frequencyId != null ? frequencyId.hashCode() : 0);
        result = 31 * result + (startDtctime != null ? startDtctime.hashCode() : 0);
        result = 31 * result + (dueDtctime != null ? dueDtctime.hashCode() : 0);
        result = 31 * result + (completionCtime != null ? completionCtime.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (startCtime != null ? startCtime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (everyDh != null ? everyDh.hashCode() : 0);
        result = 31 * result + (monday != null ? monday.hashCode() : 0);
        result = 31 * result + (tuesday != null ? tuesday.hashCode() : 0);
        result = 31 * result + (wednesday != null ? wednesday.hashCode() : 0);
        result = 31 * result + (thursday != null ? thursday.hashCode() : 0);
        result = 31 * result + (friday != null ? friday.hashCode() : 0);
        result = 31 * result + (saturday != null ? saturday.hashCode() : 0);
        result = 31 * result + (sunday != null ? sunday.hashCode() : 0);
        return result;
    }
}
