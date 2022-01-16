package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class OdeljenjeLekarDezurstvoPK implements Serializable {
    @Column(name = "odeljenje_odeljenje_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int odeljenjeOdeljenjeId;
    @Column(name = "lekar_zaposleni_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lekarZaposleniId;

    public int getOdeljenjeOdeljenjeId() {
        return odeljenjeOdeljenjeId;
    }

    public void setOdeljenjeOdeljenjeId(int odeljenjeOdeljenjeId) {
        this.odeljenjeOdeljenjeId = odeljenjeOdeljenjeId;
    }

    public int getLekarZaposleniId() {
        return lekarZaposleniId;
    }

    public void setLekarZaposleniId(int lekarZaposleniId) {
        this.lekarZaposleniId = lekarZaposleniId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OdeljenjeLekarDezurstvoPK that = (OdeljenjeLekarDezurstvoPK) o;

        if (odeljenjeOdeljenjeId != that.odeljenjeOdeljenjeId) return false;
        if (lekarZaposleniId != that.lekarZaposleniId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = odeljenjeOdeljenjeId;
        result = 31 * result + lekarZaposleniId;
        return result;
    }
}
