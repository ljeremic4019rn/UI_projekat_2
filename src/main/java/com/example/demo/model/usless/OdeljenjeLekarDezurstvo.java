package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "odeljenje_lekar_dezurstvo", schema = "bolnicamodel", catalog = "")
@IdClass(OdeljenjeLekarDezurstvoPK.class)
public class OdeljenjeLekarDezurstvo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "odeljenje_odeljenje_id")
    private int odeljenjeOdeljenjeId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lekar_zaposleni_id")
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

        OdeljenjeLekarDezurstvo that = (OdeljenjeLekarDezurstvo) o;

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
