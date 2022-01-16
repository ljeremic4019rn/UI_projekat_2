package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "lekar_procedura", schema = "bolnicamodel", catalog = "")
@IdClass(LekarProceduraPK.class)
public class LekarProcedura {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lekar_zaposleni_id")
    private int lekarZaposleniId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "procedura_procedura_id")
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

        LekarProcedura that = (LekarProcedura) o;

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
