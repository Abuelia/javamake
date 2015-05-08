package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "fs_files", schema = "", catalog = "tcnotifications")
public class FsFilesEntity {
    private long id;
    private String comment;
    private long ctime;
    private String extention;
    private long hash;
    private long mtime;
    private String name;
    private long parentId;
    private String path;
    private String ramdomCode;
    private long size;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
    @Column(name = "extention")
    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
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
    @Column(name = "mtime")
    public long getMtime() {
        return mtime;
    }

    public void setMtime(long mtime) {
        this.mtime = mtime;
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
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "ramdom_code")
    public String getRamdomCode() {
        return ramdomCode;
    }

    public void setRamdomCode(String ramdomCode) {
        this.ramdomCode = ramdomCode;
    }

    @Basic
    @Column(name = "size")
    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FsFilesEntity that = (FsFilesEntity) o;

        if (id != that.id) return false;
        if (ctime != that.ctime) return false;
        if (hash != that.hash) return false;
        if (mtime != that.mtime) return false;
        if (parentId != that.parentId) return false;
        if (size != that.size) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (extention != null ? !extention.equals(that.extention) : that.extention != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (ramdomCode != null ? !ramdomCode.equals(that.ramdomCode) : that.ramdomCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (int) (ctime ^ (ctime >>> 32));
        result = 31 * result + (extention != null ? extention.hashCode() : 0);
        result = 31 * result + (int) (hash ^ (hash >>> 32));
        result = 31 * result + (int) (mtime ^ (mtime >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (parentId ^ (parentId >>> 32));
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (ramdomCode != null ? ramdomCode.hashCode() : 0);
        result = 31 * result + (int) (size ^ (size >>> 32));
        return result;
    }
}
