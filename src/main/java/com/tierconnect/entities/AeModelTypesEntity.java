package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "ae_model_types", schema = "", catalog = "tcnotifications")
public class AeModelTypesEntity {
    private int id;
    private String modelName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "model_name")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeModelTypesEntity that = (AeModelTypesEntity) o;

        if (id != that.id) return false;
        if (modelName != null ? !modelName.equals(that.modelName) : that.modelName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (modelName != null ? modelName.hashCode() : 0);
        return result;
    }
}
