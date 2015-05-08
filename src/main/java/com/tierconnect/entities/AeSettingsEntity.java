package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "ae_settings", schema = "", catalog = "tcnotifications")
@IdClass(AeSettingsEntityPK.class)
public class AeSettingsEntity {
    private int userId;
    private String sname;
    private String svalue;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "svalue")
    public String getSvalue() {
        return svalue;
    }

    public void setSvalue(String svalue) {
        this.svalue = svalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeSettingsEntity that = (AeSettingsEntity) o;

        if (userId != that.userId) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (svalue != null ? !svalue.equals(that.svalue) : that.svalue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (svalue != null ? svalue.hashCode() : 0);
        return result;
    }
}
