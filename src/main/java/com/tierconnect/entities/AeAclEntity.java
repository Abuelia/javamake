package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "ae_acl", schema = "", catalog = "tcnotifications")
@IdClass(AeAclEntityPK.class)
public class AeAclEntity {
    private int aclModuleId;
    private int userId;
    private int groupId;
    private byte level;

    @Id
    @GeneratedValue
    @Column(name = "acl_module_id")
    public int getAclModuleId() {
        return aclModuleId;
    }

    public void setAclModuleId(int aclModuleId) {
        this.aclModuleId = aclModuleId;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "group_id")
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "level")
    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeAclEntity that = (AeAclEntity) o;

        if (aclModuleId != that.aclModuleId) return false;
        if (userId != that.userId) return false;
        if (groupId != that.groupId) return false;
        if (level != that.level) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aclModuleId;
        result = 31 * result + userId;
        result = 31 * result + groupId;
        result = 31 * result + (int) level;
        return result;
    }
}
