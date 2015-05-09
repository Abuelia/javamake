package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "va_links_checks", schema = "", catalog = "tcnotifications")
public class VaLinksChecksEntity {
    private int id;
    private Integer modelId;
    private Integer modelTypeId;
    private Integer folderId;
    private String description;
    private Long ctime;
    private Integer modelTypeIdBm;
    private Integer modeIdBm;

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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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

    @Basic
    @Column(name = "model_type_id_bm")
    public Integer getModelTypeIdBm() {
        return modelTypeIdBm;
    }

    public void setModelTypeIdBm(Integer modelTypeIdBm) {
        this.modelTypeIdBm = modelTypeIdBm;
    }

    @Basic
    @Column(name = "mode_id_bm")
    public Integer getModeIdBm() {
        return modeIdBm;
    }

    public void setModeIdBm(Integer modeIdBm) {
        this.modeIdBm = modeIdBm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaLinksChecksEntity that = (VaLinksChecksEntity) o;

        if (id != that.id) return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (modelTypeId != null ? !modelTypeId.equals(that.modelTypeId) : that.modelTypeId != null) return false;
        if (folderId != null ? !folderId.equals(that.folderId) : that.folderId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (ctime != null ? !ctime.equals(that.ctime) : that.ctime != null) return false;
        if (modelTypeIdBm != null ? !modelTypeIdBm.equals(that.modelTypeIdBm) : that.modelTypeIdBm != null)
            return false;
        if (modeIdBm != null ? !modeIdBm.equals(that.modeIdBm) : that.modeIdBm != null) return false;

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
        result = 31 * result + (modelTypeIdBm != null ? modelTypeIdBm.hashCode() : 0);
        result = 31 * result + (modeIdBm != null ? modeIdBm.hashCode() : 0);
        return result;
    }
}
