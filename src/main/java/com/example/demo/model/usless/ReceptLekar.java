package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "recept_lekar", schema = "bolnicamodel", catalog = "")
@IdClass(ReceptLekarPK.class)
public class ReceptLekar {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "recept_id")
    private int receptId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "zaposleni_id")
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

        ReceptLekar that = (ReceptLekar) o;

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
