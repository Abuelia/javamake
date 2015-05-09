package com.tierconnect.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "js_jobs", schema = "", catalog = "tcnotifications")
public class JsJobsEntity {
    private int id;
    private int accountId;
    private String publicId;
    private String title;
    private String baseurl;
    private String baseRsJson;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;
    private Integer lastLinkBmId;
    private Integer lastLinkInsId;
    private Integer ownerUserId;

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
    @Column(name = "account_id")
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "public_id")
    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "baseurl")
    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }

    @Basic
    @Column(name = "base_rs_json")
    public String getBaseRsJson() {
        return baseRsJson;
    }

    public void setBaseRsJson(String baseRsJson) {
        this.baseRsJson = baseRsJson;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "deleted_at")
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Basic
    @Column(name = "last_link_bm_id")
    public Integer getLastLinkBmId() {
        return lastLinkBmId;
    }

    public void setLastLinkBmId(Integer lastLinkBmId) {
        this.lastLinkBmId = lastLinkBmId;
    }

    @Basic
    @Column(name = "last_link_ins_id")
    public Integer getLastLinkInsId() {
        return lastLinkInsId;
    }

    public void setLastLinkInsId(Integer lastLinkInsId) {
        this.lastLinkInsId = lastLinkInsId;
    }

    @Basic
    @Column(name = "owner_user_id")
    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsJobsEntity that = (JsJobsEntity) o;

        if (id != that.id) return false;
        if (accountId != that.accountId) return false;
        if (publicId != null ? !publicId.equals(that.publicId) : that.publicId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (baseurl != null ? !baseurl.equals(that.baseurl) : that.baseurl != null) return false;
        if (baseRsJson != null ? !baseRsJson.equals(that.baseRsJson) : that.baseRsJson != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;
        if (lastLinkBmId != null ? !lastLinkBmId.equals(that.lastLinkBmId) : that.lastLinkBmId != null) return false;
        if (lastLinkInsId != null ? !lastLinkInsId.equals(that.lastLinkInsId) : that.lastLinkInsId != null)
            return false;
        if (ownerUserId != null ? !ownerUserId.equals(that.ownerUserId) : that.ownerUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + accountId;
        result = 31 * result + (publicId != null ? publicId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (baseurl != null ? baseurl.hashCode() : 0);
        result = 31 * result + (baseRsJson != null ? baseRsJson.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        result = 31 * result + (lastLinkBmId != null ? lastLinkBmId.hashCode() : 0);
        result = 31 * result + (lastLinkInsId != null ? lastLinkInsId.hashCode() : 0);
        result = 31 * result + (ownerUserId != null ? ownerUserId.hashCode() : 0);
        return result;
    }
}
