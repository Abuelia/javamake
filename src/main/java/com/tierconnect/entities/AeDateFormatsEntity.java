package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@Table(name = "ae_date_formats", schema = "", catalog = "tcnotifications")
public class AeDateFormatsEntity {
    private int id;
    private String format;
    private String pickerFormat;
    private String label;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "picker_format")
    public String getPickerFormat() {
        return pickerFormat;
    }

    public void setPickerFormat(String pickerFormat) {
        this.pickerFormat = pickerFormat;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeDateFormatsEntity that = (AeDateFormatsEntity) o;

        if (id != that.id) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (pickerFormat != null ? !pickerFormat.equals(that.pickerFormat) : that.pickerFormat != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (pickerFormat != null ? pickerFormat.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}
