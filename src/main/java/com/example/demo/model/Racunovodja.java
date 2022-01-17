package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Racunovodja {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long racunovodjaId;

    public Long getRacunovodjaId() {
        return racunovodjaId;
    }

    public void setRacunovodjaId(Long zaposleniId) {
        this.racunovodjaId = zaposleniId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Racunovodja that = (Racunovodja) o;
        return Objects.equals(racunovodjaId, that.racunovodjaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racunovodjaId);
    }
}
