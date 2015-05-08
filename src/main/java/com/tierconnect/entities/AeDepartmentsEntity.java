package com.tierconnect.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "ae_departments", schema = "", catalog = "tcnotifications")
public class AeDepartmentsEntity {
    private long id;
    private Integer accountId;
    private String name;
    private Long parentId;
    private AeDepartmentsEntity aeDepartmentsByParentId;
    private Collection<AeDepartmentsEntity> aeDepartmentsesById;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account_id")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeDepartmentsEntity that = (AeDepartmentsEntity) o;

        if (id != that.id) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    public AeDepartmentsEntity getAeDepartmentsByParentId() {
        return aeDepartmentsByParentId;
    }

    public void setAeDepartmentsByParentId(AeDepartmentsEntity aeDepartmentsByParentId) {
        this.aeDepartmentsByParentId = aeDepartmentsByParentId;
    }

    @OneToMany(mappedBy = "aeDepartmentsByParentId")
    public Collection<AeDepartmentsEntity> getAeDepartmentsesById() {
        return aeDepartmentsesById;
    }

    public void setAeDepartmentsesById(Collection<AeDepartmentsEntity> aeDepartmentsesById) {
        this.aeDepartmentsesById = aeDepartmentsesById;
    }
}
