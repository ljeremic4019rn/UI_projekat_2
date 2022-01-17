package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sestra {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long SestraId;
    private Boolean licenca;
    private String pozicija;
    @OneToOne
    private Blok dezurniBlok;
    @OneToMany
    private List<Procedura> procedure;
    @OneToMany
    private List<CovidLista> covidListe;

    public List<CovidLista> getCovidListe() {
        return covidListe;
    }

    public void setCovidListe(List<CovidLista> covidListe) {
        this.covidListe = covidListe;
    }

    public Long getSestraId() {
        return SestraId;
    }

    public void setSestraId(Long zaposleniId) {
        this.SestraId = zaposleniId;
    }

    public Boolean getLicenca() {
        return licenca;
    }

    public void setLicenca(Boolean licenca) {
        this.licenca = licenca;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public Blok getDezurniBlok() {
        return dezurniBlok;
    }

    public void setDezurniBlok(Blok dezurniBlok) {
        this.dezurniBlok = dezurniBlok;
    }

    public List<Procedura> getProcedure() {
        return procedure;
    }

    public void setProcedure(List<Procedura> procedure) {
        this.procedure = procedure;
    }

}
