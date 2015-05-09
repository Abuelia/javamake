package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "ae_activitylog", schema = "", catalog = "tcnotifications")
public class AeActivitylogEntity {
    private int id;
    private Integer createdAt;
    private Integer accountId;
    private Integer modelId;
    private Integer modelTypeId;
    private Integer userId;
    private Integer groupId;
    private Integer invitationId;
    private String message;
    private String jsonCopy;
    private Integer activityTypeId;
    private Integer noIssues;
    private Integer reqModelTypeId;
    private Integer reqModelId;

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
    @Column(name = "created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "account_id")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "group_id")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "invitation_id")
    public Integer getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "json_copy")
    public String getJsonCopy() {
        return jsonCopy;
    }

    public void setJsonCopy(String jsonCopy) {
        this.jsonCopy = jsonCopy;
    }

    @Basic
    @Column(name = "activity_type_id")
    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    @Basic
    @Column(name = "no_issues")
    public Integer getNoIssues() {
        return noIssues;
    }

    public void setNoIssues(Integer noIssues) {
        this.noIssues = noIssues;
    }

    @Basic
    @Column(name = "req_model_type_id")
    public Integer getReqModelTypeId() {
        return reqModelTypeId;
    }

    public void setReqModelTypeId(Integer reqModelTypeId) {
        this.reqModelTypeId = reqModelTypeId;
    }

    @Basic
    @Column(name = "req_model_id")
    public Integer getReqModelId() {
        return reqModelId;
    }

    public void setReqModelId(Integer reqModelId) {
        this.reqModelId = reqModelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeActivitylogEntity that = (AeActivitylogEntity) o;

        if (id != that.id) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (modelTypeId != null ? !modelTypeId.equals(that.modelTypeId) : that.modelTypeId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (invitationId != null ? !invitationId.equals(that.invitationId) : that.invitationId != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (jsonCopy != null ? !jsonCopy.equals(that.jsonCopy) : that.jsonCopy != null) return false;
        if (activityTypeId != null ? !activityTypeId.equals(that.activityTypeId) : that.activityTypeId != null)
            return false;
        if (noIssues != null ? !noIssues.equals(that.noIssues) : that.noIssues != null) return false;
        if (reqModelTypeId != null ? !reqModelTypeId.equals(that.reqModelTypeId) : that.reqModelTypeId != null)
            return false;
        if (reqModelId != null ? !reqModelId.equals(that.reqModelId) : that.reqModelId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        result = 31 * result + (modelTypeId != null ? modelTypeId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (invitationId != null ? invitationId.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (jsonCopy != null ? jsonCopy.hashCode() : 0);
        result = 31 * result + (activityTypeId != null ? activityTypeId.hashCode() : 0);
        result = 31 * result + (noIssues != null ? noIssues.hashCode() : 0);
        result = 31 * result + (reqModelTypeId != null ? reqModelTypeId.hashCode() : 0);
        result = 31 * result + (reqModelId != null ? reqModelId.hashCode() : 0);
        return result;
    }
}
