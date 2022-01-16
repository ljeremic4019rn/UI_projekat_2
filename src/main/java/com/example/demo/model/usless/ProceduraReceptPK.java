package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ProceduraReceptPK implements Serializable {
    @Column(name = "procedura_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int proceduraId;
    @Column(name = "recept_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receptId;

    public int getProceduraId() {
        return proceduraId;
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
    }

    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProceduraReceptPK that = (ProceduraReceptPK) o;

        if (proceduraId != that.proceduraId) return false;
        if (receptId != that.receptId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = proceduraId;
        result = 31 * result + receptId;
        return result;
    }
}
