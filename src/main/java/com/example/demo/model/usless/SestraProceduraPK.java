package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class SestraProceduraPK implements Serializable {
    @Column(name = "sestra_zaposleni_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sestraZaposleniId;
    @Column(name = "procedura_procedura_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int proceduraProceduraId;

    public int getSestraZaposleniId() {
        return sestraZaposleniId;
    }

    public void setSestraZaposleniId(int sestraZaposleniId) {
        this.sestraZaposleniId = sestraZaposleniId;
    }

    public int getProceduraProceduraId() {
        return proceduraProceduraId;
    }

    public void setProceduraProceduraId(int proceduraProceduraId) {
        this.proceduraProceduraId = proceduraProceduraId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SestraProceduraPK that = (SestraProceduraPK) o;

        if (sestraZaposleniId != that.sestraZaposleniId) return false;
        if (proceduraProceduraId != that.proceduraProceduraId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sestraZaposleniId;
        result = 31 * result + proceduraProceduraId;
        return result;
    }
}
