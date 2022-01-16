package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "sestra_procedura", schema = "bolnicamodel", catalog = "")
@IdClass(SestraProceduraPK.class)
public class SestraProcedura {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sestra_zaposleni_id")
    private int sestraZaposleniId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "procedura_procedura_id")
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

        SestraProcedura that = (SestraProcedura) o;

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
