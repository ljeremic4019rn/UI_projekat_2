package com.example.demo.model.usless;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class CovidListaLekPK implements Serializable {
    @Column(name = "covid_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int covidId;
    @Column(name = "lek_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lekId;

    public int getCovidId() {
        return covidId;
    }

    public void setCovidId(int covidId) {
        this.covidId = covidId;
    }

    public int getLekId() {
        return lekId;
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CovidListaLekPK that = (CovidListaLekPK) o;

        if (covidId != that.covidId) return false;
        if (lekId != that.lekId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = covidId;
        result = 31 * result + lekId;
        return result;
    }
}
