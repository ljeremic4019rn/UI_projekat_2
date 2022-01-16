package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "lek_recept", schema = "bolnicamodel", catalog = "")
@IdClass(LekReceptPK.class)
public class LekRecept {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lek_id")
    private int lekId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "recept_id")
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

        LekRecept lekRecept = (LekRecept) o;

        if (lekId != lekRecept.lekId) return false;
        if (receptId != lekRecept.receptId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lekId;
        result = 31 * result + receptId;
        return result;
    }
}
