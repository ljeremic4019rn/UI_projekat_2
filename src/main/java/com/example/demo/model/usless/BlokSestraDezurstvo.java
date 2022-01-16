package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "blok_sestra_dezurstvo", schema = "bolnicamodel", catalog = "")
@IdClass(BlokSestraDezurstvoPK.class)
public class BlokSestraDezurstvo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "blok_blok_id")
    private int blokBlokId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sestra_zaposleni_id")
    private int sestraZaposleniId;

    public int getBlokBlokId() {
        return blokBlokId;
    }

    public void setBlokBlokId(int blokBlokId) {
        this.blokBlokId = blokBlokId;
    }

    public int getSestraZaposleniId() {
        return sestraZaposleniId;
    }

    public void setSestraZaposleniId(int sestraZaposleniId) {
        this.sestraZaposleniId = sestraZaposleniId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlokSestraDezurstvo that = (BlokSestraDezurstvo) o;

        if (blokBlokId != that.blokBlokId) return false;
        if (sestraZaposleniId != that.sestraZaposleniId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blokBlokId;
        result = 31 * result + sestraZaposleniId;
        return result;
    }
}
