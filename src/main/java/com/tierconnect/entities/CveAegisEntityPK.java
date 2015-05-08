package com.tierconnect.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
public class CveAegisEntityPK implements Serializable {
    private String param;
    private String value;

    @Column(name = "param")
    @Id
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Column(name = "value")
    @Id
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CveAegisEntityPK that = (CveAegisEntityPK) o;

        if (param != null ? !param.equals(that.param) : that.param != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = param != null ? param.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
