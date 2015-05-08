package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "ae_modules", schema = "", catalog = "tcnotifications")
public class AeModulesEntity {
    private String id;
    private int version;
    private int sortOrder;
    private byte adminMenu;
    private int aclId;
    private byte enabled;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "sort_order")
    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "admin_menu")
    public byte getAdminMenu() {
        return adminMenu;
    }

    public void setAdminMenu(byte adminMenu) {
        this.adminMenu = adminMenu;
    }

    @Basic
    @Column(name = "acl_id")
    public int getAclId() {
        return aclId;
    }

    public void setAclId(int aclId) {
        this.aclId = aclId;
    }

    @Basic
    @Column(name = "enabled")
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeModulesEntity that = (AeModulesEntity) o;

        if (version != that.version) return false;
        if (sortOrder != that.sortOrder) return false;
        if (adminMenu != that.adminMenu) return false;
        if (aclId != that.aclId) return false;
        if (enabled != that.enabled) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + version;
        result = 31 * result + sortOrder;
        result = 31 * result + (int) adminMenu;
        result = 31 * result + aclId;
        result = 31 * result + (int) enabled;
        return result;
    }
}
