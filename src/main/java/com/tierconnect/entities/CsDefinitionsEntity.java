package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "cs_definitions", schema = "", catalog = "tcnotifications")
public class CsDefinitionsEntity {
    private int id;
    private Integer orderId;
    private Integer caseId;
    private String jsonText;
    private Short defType;
    private String rrule;
    private Integer ssFileId;

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
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "case_id")
    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
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
    @Column(name = "def_type")
    public Short getDefType() {
        return defType;
    }

    public void setDefType(Short defType) {
        this.defType = defType;
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
    @Column(name = "ss_file_id")
    public Integer getSsFileId() {
        return ssFileId;
    }

    public void setSsFileId(Integer ssFileId) {
        this.ssFileId = ssFileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CsDefinitionsEntity that = (CsDefinitionsEntity) o;

        if (id != that.id) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (caseId != null ? !caseId.equals(that.caseId) : that.caseId != null) return false;
        if (jsonText != null ? !jsonText.equals(that.jsonText) : that.jsonText != null) return false;
        if (defType != null ? !defType.equals(that.defType) : that.defType != null) return false;
        if (rrule != null ? !rrule.equals(that.rrule) : that.rrule != null) return false;
        if (ssFileId != null ? !ssFileId.equals(that.ssFileId) : that.ssFileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (caseId != null ? caseId.hashCode() : 0);
        result = 31 * result + (jsonText != null ? jsonText.hashCode() : 0);
        result = 31 * result + (defType != null ? defType.hashCode() : 0);
        result = 31 * result + (rrule != null ? rrule.hashCode() : 0);
        result = 31 * result + (ssFileId != null ? ssFileId.hashCode() : 0);
        return result;
    }
}
