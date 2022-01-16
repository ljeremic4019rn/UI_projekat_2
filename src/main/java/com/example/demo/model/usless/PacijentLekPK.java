package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class PacijentLekPK implements Serializable {
    @Column(name = "lek_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lekId;
    @Column(name = "pacijent_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacijentId;

    public int getLekId() {
        return lekId;
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public int getPacijentId() {
        return pacijentId;
    }

    public void setPacijentId(int pacijentId) {
        this.pacijentId = pacijentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacijentLekPK that = (PacijentLekPK) o;

        if (lekId != that.lekId) return false;
        if (pacijentId != that.pacijentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lekId;
        result = 31 * result + pacijentId;
        return result;
    }
}
