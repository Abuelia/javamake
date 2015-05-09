package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "ns_notifications", schema = "", catalog = "tcnotifications")
public class NsNotificationsEntity {
    private int id;
    private Integer linkNsId;
    private String name;
    private Short type;
    private Integer frequencyId;
    private Long startTime;
    private Long dueTime;
    private Short methodType;
    private Integer userToId;
    private Integer groupToId;
    private String rrule;
    private Integer modelId;
    private Integer modelTypeId;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "link_ns_id")
    public Integer getLinkNsId() {
        return linkNsId;
    }

    public void setLinkNsId(Integer linkNsId) {
        this.linkNsId = linkNsId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    @Basic
    @Column(name = "frequency_id")
    public Integer getFrequencyId() {
        return frequencyId;
    }

    public void setFrequencyId(Integer frequencyId) {
        this.frequencyId = frequencyId;
    }

    @Basic
    @Column(name = "start_time")
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "due_time")
    public Long getDueTime() {
        return dueTime;
    }

    public void setDueTime(Long dueTime) {
        this.dueTime = dueTime;
    }

    @Basic
    @Column(name = "method_type")
    public Short getMethodType() {
        return methodType;
    }

    public void setMethodType(Short methodType) {
        this.methodType = methodType;
    }

    @Basic
    @Column(name = "user_to_id")
    public Integer getUserToId() {
        return userToId;
    }

    public void setUserToId(Integer userToId) {
        this.userToId = userToId;
    }

    @Basic
    @Column(name = "group_to_id")
    public Integer getGroupToId() {
        return groupToId;
    }

    public void setGroupToId(Integer groupToId) {
        this.groupToId = groupToId;
    }

    @Basic
    @Column(name = "rrule")
    public String getRrule() {
        return rrule;
    }

    public void setRrule(String rrule) {
        this.rrule = rrule;
    }

    @Basic
    @Column(name = "model_id")
    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "model_type_id")
    public Integer getModelTypeId() {
        return modelTypeId;
    }

    public void setModelTypeId(Integer modelTypeId) {
        this.modelTypeId = modelTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NsNotificationsEntity that = (NsNotificationsEntity) o;

        if (id != that.id) return false;
        if (linkNsId != null ? !linkNsId.equals(that.linkNsId) : that.linkNsId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (frequencyId != null ? !frequencyId.equals(that.frequencyId) : that.frequencyId != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (dueTime != null ? !dueTime.equals(that.dueTime) : that.dueTime != null) return false;
        if (methodType != null ? !methodType.equals(that.methodType) : that.methodType != null) return false;
        if (userToId != null ? !userToId.equals(that.userToId) : that.userToId != null) return false;
        if (groupToId != null ? !groupToId.equals(that.groupToId) : that.groupToId != null) return false;
        if (rrule != null ? !rrule.equals(that.rrule) : that.rrule != null) return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (modelTypeId != null ? !modelTypeId.equals(that.modelTypeId) : that.modelTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (linkNsId != null ? linkNsId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (frequencyId != null ? frequencyId.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (dueTime != null ? dueTime.hashCode() : 0);
        result = 31 * result + (methodType != null ? methodType.hashCode() : 0);
        result = 31 * result + (userToId != null ? userToId.hashCode() : 0);
        result = 31 * result + (groupToId != null ? groupToId.hashCode() : 0);
        result = 31 * result + (rrule != null ? rrule.hashCode() : 0);
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        result = 31 * result + (modelTypeId != null ? modelTypeId.hashCode() : 0);
        return result;
    }
}
