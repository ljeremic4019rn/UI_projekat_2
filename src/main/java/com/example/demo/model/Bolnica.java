package com.example.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Bolnica {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long bolnicaId;
    private String ime;
    private String prezime;
    @OneToMany
    private List<Lekar> lekari;
    @OneToMany
    private List<Sestra> sestre;
    @OneToMany
    private List<PrijemnaLista> prijemneListe;
    @OneToMany
    private List<Dezurstvo> dezurstva;
    @OneToMany
    private List<ObukaProcedure> obukeProcedura;
    @OneToMany
    private List <Prekovremeno> prekovemeno;
    @OneToMany
    private List<Odmor> odmori;
    @OneToMany
    private List<Racunovodja> racunovodje;
    @OneToMany
    private List<Odeljenje> odeljenja;


    public Long getBolnicaId() {
        return bolnicaId;
    }

    public void setBolnicaId(Long bolnicaId) {
        this.bolnicaId = bolnicaId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public List<Lekar> getLekari() {
        return lekari;
    }

    public void setLekari(List<Lekar> lekari) {
        this.lekari = lekari;
    }

    public List<Sestra> getSestre() {
        return sestre;
    }

    public void setSestre(List<Sestra> sestre) {
        this.sestre = sestre;
    }

    public List<PrijemnaLista> getPrijemneListe() {
        return prijemneListe;
    }

    public void setPrijemneListe(List<PrijemnaLista> prijemneListe) {
        this.prijemneListe = prijemneListe;
    }

    public List<Dezurstvo> getDezurstva() {
        return dezurstva;
    }

    public void setDezurstva(List<Dezurstvo> dezurstva) {
        this.dezurstva = dezurstva;
    }

    public List<ObukaProcedure> getObukeProcedura() {
        return obukeProcedura;
    }

    public void setObukeProcedura(List<ObukaProcedure> obukeProcedura) {
        this.obukeProcedura = obukeProcedura;
    }

    public List<Prekovremeno> getPrekovemeno() {
        return prekovemeno;
    }

    public void setPrekovemeno(List<Prekovremeno> prekovemeno) {
        this.prekovemeno = prekovemeno;
    }

    public List<Odmor> getOdmori() {
        return odmori;
    }

    public void setOdmori(List<Odmor> odmori) {
        this.odmori = odmori;
    }

    public List<Racunovodja> getRacunovodje() {
        return racunovodje;
    }

    public void setRacunovodje(List<Racunovodja> racunovodje) {
        this.racunovodje = racunovodje;
    }

    public List<Odeljenje> getOdeljenja() {
        return odeljenja;
    }

    public void setOdeljenja(List<Odeljenje> odeljenja) {
        this.odeljenja = odeljenja;
    }



}
