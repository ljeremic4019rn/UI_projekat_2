package com.example.demo.model.usless;

import javax.persistence.*;

@Entity
@Table(name = "covid_lista_lek", schema = "bolnicamodel", catalog = "")
@IdClass(CovidListaLekPK.class)
public class CovidListaLek {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "covid_id")
    private int covidId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lek_id")
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

        CovidListaLek that = (CovidListaLek) o;

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
