package com.example.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Lekar {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long lekarId;
    private String specijalizacija;
    @ManyToMany
    private List<Odeljenje> odeljenje;
    @OneToOne
    private Odeljenje odeljenjeDezurni;
    @OneToOne
    private Odeljenje primarnoOdeljenje;
    @OneToMany
    private List<Procedura> procedure;
    @OneToMany
    private List<PacijentKarton> pacijenti;
    @OneToMany
    private List<Recept> recepti;
    @OneToMany
    private List<CovidLista> covidListe;

    public List<Recept> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<Recept> recepti) {
        this.recepti = recepti;
    }

    public List<CovidLista> getCovidListe() {
        return covidListe;
    }

    public void setCovidListe(List<CovidLista> covidListe) {
        this.covidListe = covidListe;
    }

    public Long getLekarId() {
        return lekarId;
    }

    public void setLekarId(Long zaposleniId) {
        this.lekarId = zaposleniId;
    }

    public String getSpecijalizacija() {
        return specijalizacija;
    }

    public void setSpecijalizacija(String specijalizacija) {
        this.specijalizacija = specijalizacija;
    }

    public List<Odeljenje> getOdeljenje() {
        return odeljenje;
    }

    public void setOdeljenje(List<Odeljenje> odeljenje) {
        this.odeljenje = odeljenje;
    }

    public Odeljenje getOdeljenjeDezurni() {
        return odeljenjeDezurni;
    }

    public void setOdeljenjeDezurni(Odeljenje odeljenjeDezurni) {
        this.odeljenjeDezurni = odeljenjeDezurni;
    }

    public Odeljenje getPrimarnoOdeljenje() {
        return primarnoOdeljenje;
    }

    public void setPrimarnoOdeljenje(Odeljenje primarnoOdeljenje) {
        this.primarnoOdeljenje = primarnoOdeljenje;
    }

    public List<Procedura> getProcedure() {
        return procedure;
    }

    public void setProcedure(List<Procedura> procedure) {
        this.procedure = procedure;
    }

    public List<PacijentKarton> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<PacijentKarton> pacijenti) {
        this.pacijenti = pacijenti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lekar lekar = (Lekar) o;
        return lekarId == lekar.lekarId && Objects.equals(specijalizacija, lekar.specijalizacija) && Objects.equals(odeljenje, lekar.odeljenje) && Objects.equals(odeljenjeDezurni, lekar.odeljenjeDezurni) && Objects.equals(primarnoOdeljenje, lekar.primarnoOdeljenje) && Objects.equals(procedure, lekar.procedure) && Objects.equals(pacijenti, lekar.pacijenti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lekarId, specijalizacija, odeljenje, odeljenjeDezurni, primarnoOdeljenje, procedure, pacijenti);
    }
}
