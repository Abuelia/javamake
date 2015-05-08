package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "va_variances", schema = "", catalog = "tcnotifications")
public class VaVariancesEntity {
    private int id;
    private int checkId;
    private Integer ctime;
    private String jsonText;
    private Short notified;
    private Long dtNotified;
    private Integer ssFileId;
    private Integer ssFileBmId;
    private Short varianceType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "check_id")
    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "ctime")
    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "json_text")
    public String getJsonText() {
        return jsonText;
    }

    public void setJsonText(String jsonText) {
        this.jsonText = jsonText;
    }

    @Basic
    @Column(name = "notified")
    public Short getNotified() {
        return notified;
    }

    public void setNotified(Short notified) {
        this.notified = notified;
    }

    @Basic
    @Column(name = "dt_notified")
    public Long getDtNotified() {
        return dtNotified;
    }

    public void setDtNotified(Long dtNotified) {
        this.dtNotified = dtNotified;
    }

    @Basic
    @Column(name = "ss_file_id")
    public Integer getSsFileId() {
        return ssFileId;
    }

    public void setSsFileId(Integer ssFileId) {
        this.ssFileId = ssFileId;
    }

    @Basic
    @Column(name = "ss_file_bm_id")
    public Integer getSsFileBmId() {
        return ssFileBmId;
    }

    public void setSsFileBmId(Integer ssFileBmId) {
        this.ssFileBmId = ssFileBmId;
    }

    @Basic
    @Column(name = "variance_type")
    public Short getVarianceType() {
        return varianceType;
    }

    public void setVarianceType(Short varianceType) {
        this.varianceType = varianceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaVariancesEntity that = (VaVariancesEntity) o;

        if (id != that.id) return false;
        if (checkId != that.checkId) return false;
        if (ctime != null ? !ctime.equals(that.ctime) : that.ctime != null) return false;
        if (jsonText != null ? !jsonText.equals(that.jsonText) : that.jsonText != null) return false;
        if (notified != null ? !notified.equals(that.notified) : that.notified != null) return false;
        if (dtNotified != null ? !dtNotified.equals(that.dtNotified) : that.dtNotified != null) return false;
        if (ssFileId != null ? !ssFileId.equals(that.ssFileId) : that.ssFileId != null) return false;
        if (ssFileBmId != null ? !ssFileBmId.equals(that.ssFileBmId) : that.ssFileBmId != null) return false;
        if (varianceType != null ? !varianceType.equals(that.varianceType) : that.varianceType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + checkId;
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        result = 31 * result + (jsonText != null ? jsonText.hashCode() : 0);
        result = 31 * result + (notified != null ? notified.hashCode() : 0);
        result = 31 * result + (dtNotified != null ? dtNotified.hashCode() : 0);
        result = 31 * result + (ssFileId != null ? ssFileId.hashCode() : 0);
        result = 31 * result + (ssFileBmId != null ? ssFileBmId.hashCode() : 0);
        result = 31 * result + (varianceType != null ? varianceType.hashCode() : 0);
        return result;
    }
}
