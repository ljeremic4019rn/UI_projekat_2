package com.example.demo.dto;

import java.util.List;

public class BolnicaZaposleniDto {
    private int bolnicaZaposleniId;
    private String ime;
    private String prezime;

    private List<LekarDto> lekari;
    private List<SestraDto> sestre;
    private List<PrijemnaListaDto> prijemnaListe;
    private List<DezurstvoDto> dezurstva;
    private List<ObukaProcedureDto> obuke;
    private List<PrekovremenoDto> prekovremeno;
    private List<OdmorDto> odmori;
    private List<RacunovodjaDto> racunovodje;
    private List<OdeljenjeDto> odeljenja;

    public List<LekarDto> getLekari() {
        return lekari;
    }

    public void setLekari(List<LekarDto> lekari) {
        this.lekari = lekari;
    }

    public List<SestraDto> getSestre() {
        return sestre;
    }

    public void setSestre(List<SestraDto> sestre) {
        this.sestre = sestre;
    }

    public List<PrijemnaListaDto> getPrijemnaListe() {
        return prijemnaListe;
    }

    public void setPrijemnaListe(List<PrijemnaListaDto> prijemnaListe) {
        this.prijemnaListe = prijemnaListe;
    }

    public List<DezurstvoDto> getDezurstva() {
        return dezurstva;
    }

    public void setDezurstva(List<DezurstvoDto> dezurstva) {
        this.dezurstva = dezurstva;
    }

    public List<ObukaProcedureDto> getObuke() {
        return obuke;
    }

    public void setObuke(List<ObukaProcedureDto> obuke) {
        this.obuke = obuke;
    }

    public List<PrekovremenoDto> getPrekovremeno() {
        return prekovremeno;
    }

    public void setPrekovremeno(List<PrekovremenoDto> prekovremeno) {
        this.prekovremeno = prekovremeno;
    }

    public List<OdmorDto> getOdmori() {
        return odmori;
    }

    public void setOdmori(List<OdmorDto> odmori) {
        this.odmori = odmori;
    }

    public List<RacunovodjaDto> getRacunovodje() {
        return racunovodje;
    }

    public void setRacunovodje(List<RacunovodjaDto> racunovodje) {
        this.racunovodje = racunovodje;
    }

    public List<OdeljenjeDto> getOdeljenja() {
        return odeljenja;
    }

    public void setOdeljenja(List<OdeljenjeDto> odeljenja) {
        this.odeljenja = odeljenja;
    }

    public BolnicaZaposleniDto() {
    }

    public void setBolnicaZaposleniId(int bolnicaZaposleniId) {
        this.bolnicaZaposleniId = bolnicaZaposleniId;
    }

    public int getBolnicaZaposleniId() {
        return this.bolnicaZaposleniId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return this.prezime;
    }
}