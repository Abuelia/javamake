package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "sequence", schema = "", catalog = "tcnotifications")
public class SequenceEntity {
    private String seqName;
    private Long seqCount;

    @Id
    @Column(name = "SEQ_NAME")
    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    @Basic
    @Column(name = "SEQ_COUNT")
    public Long getSeqCount() {
        return seqCount;
    }

    public void setSeqCount(Long seqCount) {
        this.seqCount = seqCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SequenceEntity that = (SequenceEntity) o;

        if (seqName != null ? !seqName.equals(that.seqName) : that.seqName != null) return false;
        if (seqCount != null ? !seqCount.equals(that.seqCount) : that.seqCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = seqName != null ? seqName.hashCode() : 0;
        result = 31 * result + (seqCount != null ? seqCount.hashCode() : 0);
        return result;
    }
}
