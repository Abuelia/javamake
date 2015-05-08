package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "ae_web_drivers", schema = "", catalog = "tcnotifications")
public class AeWebDriversEntity {
    private int id;
    private String webdriver;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "webdriver")
    public String getWebdriver() {
        return webdriver;
    }

    public void setWebdriver(String webdriver) {
        this.webdriver = webdriver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeWebDriversEntity that = (AeWebDriversEntity) o;

        if (id != that.id) return false;
        if (webdriver != null ? !webdriver.equals(that.webdriver) : that.webdriver != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (webdriver != null ? webdriver.hashCode() : 0);
        return result;
    }
}
