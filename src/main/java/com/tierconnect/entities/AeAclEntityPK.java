package com.tierconnect.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
public class AeAclEntityPK implements Serializable {
    private int aclModuleId;
    private int userId;
    private int groupId;

    @Column(name = "acl_module_id")
    @Id
    public int getAclModuleId() {
        return aclModuleId;
    }

    public void setAclModuleId(int aclModuleId) {
        this.aclModuleId = aclModuleId;
    }

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "group_id")
    @Id
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeAclEntityPK that = (AeAclEntityPK) o;

        if (aclModuleId != that.aclModuleId) return false;
        if (userId != that.userId) return false;
        if (groupId != that.groupId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aclModuleId;
        result = 31 * result + userId;
        result = 31 * result + groupId;
        return result;
    }
}
