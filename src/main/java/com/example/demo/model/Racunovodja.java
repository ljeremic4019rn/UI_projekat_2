package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Racunovodja {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long zaposleniId;

    public Long getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Long zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Racunovodja that = (Racunovodja) o;
        return Objects.equals(zaposleniId, that.zaposleniId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zaposleniId);
    }
}
