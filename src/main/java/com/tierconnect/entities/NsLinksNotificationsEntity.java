package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "ns_links_notifications", schema = "", catalog = "tcnotifications")
public class NsLinksNotificationsEntity {
    private int id;
    private Integer modelId;
    private Integer modelTypeId;
    private Integer folderId;
    private Integer description;
    private Long ctime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "folder_id")
    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    @Basic
    @Column(name = "description")
    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    @Basic
    @Column(name = "ctime")
    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NsLinksNotificationsEntity that = (NsLinksNotificationsEntity) o;

        if (id != that.id) return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (modelTypeId != null ? !modelTypeId.equals(that.modelTypeId) : that.modelTypeId != null) return false;
        if (folderId != null ? !folderId.equals(that.folderId) : that.folderId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (ctime != null ? !ctime.equals(that.ctime) : that.ctime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        result = 31 * result + (modelTypeId != null ? modelTypeId.hashCode() : 0);
        result = 31 * result + (folderId != null ? folderId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        return result;
    }
}
