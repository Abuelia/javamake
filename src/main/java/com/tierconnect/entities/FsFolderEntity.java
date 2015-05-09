package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "fs_folder", schema = "", catalog = "tcnotifications")
public class FsFolderEntity {
    private long id;
    private int aclId;
    private long ctime;
    private long hash;
    private String name;
    private long parentId;
    private boolean readOnly;
    private String rootPath;
    private boolean visible;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "ctime")
    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "hash")
    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
        this.hash = hash;
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
    @Column(name = "parent_id")
    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "readOnly")
    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Basic
    @Column(name = "rootPath")
    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    @Basic
    @Column(name = "visible")
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FsFolderEntity that = (FsFolderEntity) o;

        if (id != that.id) return false;
        if (aclId != that.aclId) return false;
        if (ctime != that.ctime) return false;
        if (hash != that.hash) return false;
        if (parentId != that.parentId) return false;
        if (readOnly != that.readOnly) return false;
        if (visible != that.visible) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rootPath != null ? !rootPath.equals(that.rootPath) : that.rootPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + aclId;
        result = 31 * result + (int) (ctime ^ (ctime >>> 32));
        result = 31 * result + (int) (hash ^ (hash >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (parentId ^ (parentId >>> 32));
        result = 31 * result + (readOnly ? 1 : 0);
        result = 31 * result + (rootPath != null ? rootPath.hashCode() : 0);
        result = 31 * result + (visible ? 1 : 0);
        return result;
    }
}
