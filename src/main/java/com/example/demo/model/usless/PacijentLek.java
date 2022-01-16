package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "pacijent_lek", schema = "bolnicamodel", catalog = "")
@IdClass(PacijentLekPK.class)
public class PacijentLek {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lek_id")
    private int lekId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pacijent_id")
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

        PacijentLek that = (PacijentLek) o;

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
