package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ReceptLekarPK implements Serializable {
    @Column(name = "recept_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receptId;
    @Column(name = "zaposleni_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int zaposleniId;

    public int getReceptId() {
        return receptId;
    }

    public void setReceptId(int receptId) {
        this.receptId = receptId;
    }

    public int getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReceptLekarPK that = (ReceptLekarPK) o;

        if (receptId != that.receptId) return false;
        if (zaposleniId != that.zaposleniId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = receptId;
        result = 31 * result + zaposleniId;
        return result;
    }
}
