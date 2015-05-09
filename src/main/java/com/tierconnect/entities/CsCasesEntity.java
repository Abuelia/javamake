package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "cs_cases", schema = "", catalog = "tcnotifications")
public class CsCasesEntity {
    private int id;
    private Integer linkId;
    private String baseUrl;
    private Integer orderSeq;
    private Integer ctime;
    private Integer ssFileId;
    private Integer htmlFileId;

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
    @Column(name = "link_id")
    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    @Basic
    @Column(name = "baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Basic
    @Column(name = "order_seq")
    public Integer getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
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
    @Column(name = "ss_file_id")
    public Integer getSsFileId() {
        return ssFileId;
    }

    public void setSsFileId(Integer ssFileId) {
        this.ssFileId = ssFileId;
    }

    @Basic
    @Column(name = "html_file_id")
    public Integer getHtmlFileId() {
        return htmlFileId;
    }

    public void setHtmlFileId(Integer htmlFileId) {
        this.htmlFileId = htmlFileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CsCasesEntity that = (CsCasesEntity) o;

        if (id != that.id) return false;
        if (linkId != null ? !linkId.equals(that.linkId) : that.linkId != null) return false;
        if (baseUrl != null ? !baseUrl.equals(that.baseUrl) : that.baseUrl != null) return false;
        if (orderSeq != null ? !orderSeq.equals(that.orderSeq) : that.orderSeq != null) return false;
        if (ctime != null ? !ctime.equals(that.ctime) : that.ctime != null) return false;
        if (ssFileId != null ? !ssFileId.equals(that.ssFileId) : that.ssFileId != null) return false;
        if (htmlFileId != null ? !htmlFileId.equals(that.htmlFileId) : that.htmlFileId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (linkId != null ? linkId.hashCode() : 0);
        result = 31 * result + (baseUrl != null ? baseUrl.hashCode() : 0);
        result = 31 * result + (orderSeq != null ? orderSeq.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        result = 31 * result + (ssFileId != null ? ssFileId.hashCode() : 0);
        result = 31 * result + (htmlFileId != null ? htmlFileId.hashCode() : 0);
        return result;
    }
}
