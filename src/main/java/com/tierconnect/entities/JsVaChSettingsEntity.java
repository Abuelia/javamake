package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "js_va_ch_settings", schema = "", catalog = "tcnotifications")
public class JsVaChSettingsEntity {
    private int id;
    private Integer vaChId;
    private Integer ssSizeId;

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
    @Column(name = "va_ch_id")
    public Integer getVaChId() {
        return vaChId;
    }

    public void setVaChId(Integer vaChId) {
        this.vaChId = vaChId;
    }

    @Basic
    @Column(name = "ss_size_id")
    public Integer getSsSizeId() {
        return ssSizeId;
    }

    public void setSsSizeId(Integer ssSizeId) {
        this.ssSizeId = ssSizeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsVaChSettingsEntity that = (JsVaChSettingsEntity) o;

        if (id != that.id) return false;
        if (vaChId != null ? !vaChId.equals(that.vaChId) : that.vaChId != null) return false;
        if (ssSizeId != null ? !ssSizeId.equals(that.ssSizeId) : that.ssSizeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (vaChId != null ? vaChId.hashCode() : 0);
        result = 31 * result + (ssSizeId != null ? ssSizeId.hashCode() : 0);
        return result;
    }
}
