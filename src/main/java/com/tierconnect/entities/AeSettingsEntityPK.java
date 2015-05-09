package com.tierconnect.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
public class AeSettingsEntityPK implements Serializable {
    private int userId;
    private String sname;

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "sname")
    @Id
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeSettingsEntityPK that = (AeSettingsEntityPK) o;

        if (userId != that.userId) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }
}
