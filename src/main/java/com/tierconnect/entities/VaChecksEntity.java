package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "va_checks", schema = "", catalog = "tcnotifications")
public class VaChecksEntity {
    private int id;
    private Integer linksChecksId;
    private Integer ctimeStart;
    private Integer ctimeEnd;
    private Short checkType;
    private Integer userId;
    private String status;

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
    @Column(name = "links_checks_id")
    public Integer getLinksChecksId() {
        return linksChecksId;
    }

    public void setLinksChecksId(Integer linksChecksId) {
        this.linksChecksId = linksChecksId;
    }

    @Basic
    @Column(name = "ctime_start")
    public Integer getCtimeStart() {
        return ctimeStart;
    }

    public void setCtimeStart(Integer ctimeStart) {
        this.ctimeStart = ctimeStart;
    }

    @Basic
    @Column(name = "ctime_end")
    public Integer getCtimeEnd() {
        return ctimeEnd;
    }

    public void setCtimeEnd(Integer ctimeEnd) {
        this.ctimeEnd = ctimeEnd;
    }

    @Basic
    @Column(name = "check_type")
    public Short getCheckType() {
        return checkType;
    }

    public void setCheckType(Short checkType) {
        this.checkType = checkType;
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
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaChecksEntity that = (VaChecksEntity) o;

        if (id != that.id) return false;
        if (linksChecksId != null ? !linksChecksId.equals(that.linksChecksId) : that.linksChecksId != null)
            return false;
        if (ctimeStart != null ? !ctimeStart.equals(that.ctimeStart) : that.ctimeStart != null) return false;
        if (ctimeEnd != null ? !ctimeEnd.equals(that.ctimeEnd) : that.ctimeEnd != null) return false;
        if (checkType != null ? !checkType.equals(that.checkType) : that.checkType != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (linksChecksId != null ? linksChecksId.hashCode() : 0);
        result = 31 * result + (ctimeStart != null ? ctimeStart.hashCode() : 0);
        result = 31 * result + (ctimeEnd != null ? ctimeEnd.hashCode() : 0);
        result = 31 * result + (checkType != null ? checkType.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
