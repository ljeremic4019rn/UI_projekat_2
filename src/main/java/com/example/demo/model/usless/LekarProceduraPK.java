package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class LekarProceduraPK implements Serializable {
    @Column(name = "lekar_zaposleni_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lekarZaposleniId;
    @Column(name = "procedura_procedura_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int proceduraProceduraId;

    public int getLekarZaposleniId() {
        return lekarZaposleniId;
    }

    public void setLekarZaposleniId(int lekarZaposleniId) {
        this.lekarZaposleniId = lekarZaposleniId;
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

        LekarProceduraPK that = (LekarProceduraPK) o;

        if (lekarZaposleniId != that.lekarZaposleniId) return false;
        if (proceduraProceduraId != that.proceduraProceduraId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lekarZaposleniId;
        result = 31 * result + proceduraProceduraId;
        return result;
    }
}
