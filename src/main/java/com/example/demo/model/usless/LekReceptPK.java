package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class LekReceptPK implements Serializable {
    @Column(name = "lek_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lekId;
    @Column(name = "recept_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receptId;

    public int getLekId() {
        return lekId;
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
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

        LekReceptPK that = (LekReceptPK) o;

        if (lekId != that.lekId) return false;
        if (receptId != that.receptId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lekId;
        result = 31 * result + receptId;
        return result;
    }
}
