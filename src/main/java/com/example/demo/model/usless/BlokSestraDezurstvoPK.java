package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class BlokSestraDezurstvoPK implements Serializable {
    @Column(name = "blok_blok_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blokBlokId;
    @Column(name = "sestra_zaposleni_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        BlokSestraDezurstvoPK that = (BlokSestraDezurstvoPK) o;

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
