package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "ae_groups", schema = "", catalog = "tcnotifications")
public class AeGroupsEntity {
    private int id;
    private String name;
    private int aclId;
    private byte adminOnly;
    private int userId;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "admin_only")
    public byte getAdminOnly() {
        return adminOnly;
    }

    public void setAdminOnly(byte adminOnly) {
        this.adminOnly = adminOnly;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeGroupsEntity that = (AeGroupsEntity) o;

        if (id != that.id) return false;
        if (aclId != that.aclId) return false;
        if (adminOnly != that.adminOnly) return false;
        if (userId != that.userId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + aclId;
        result = 31 * result + (int) adminOnly;
        result = 31 * result + userId;
        return result;
    }
}
