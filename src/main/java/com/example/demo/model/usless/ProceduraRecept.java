package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "procedura_recept", schema = "bolnicamodel", catalog = "")
@IdClass(ProceduraReceptPK.class)
public class ProceduraRecept {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "procedura_id")
    private int proceduraId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "recept_id")
    private int receptId;

    public int getProceduraId() {
        return proceduraId;
    }

    public void setProceduraId(int proceduraId) {
        this.proceduraId = proceduraId;
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

        ProceduraRecept that = (ProceduraRecept) o;

        if (proceduraId != that.proceduraId) return false;
        if (receptId != that.receptId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = proceduraId;
        result = 31 * result + receptId;
        return result;
    }
}
