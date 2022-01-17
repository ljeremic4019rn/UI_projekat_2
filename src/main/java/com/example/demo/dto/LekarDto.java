package com.example.demo.dto;

import java.util.List;

public class LekarDto {
    private int lekarId;
    private String specijalizacija;
    private List<OdeljenjeDto> odeljenja;
    private OdeljenjeDto odeljenjeDezurni;
    private OdeljenjeDto primarnoOdljenje;
    private List<ProceduraDto> procedure;
    private List<PacijentKartonDto> pacijenti;
    private List<ReceptDto> recepti;
    private List<CovidListaDto> covidListe;

    public List<OdeljenjeDto> getOdeljenja() {
        return odeljenja;
    }


    public void setOdeljenja(List<OdeljenjeDto> odeljenja) {
        this.odeljenja = odeljenja;
    }

    public OdeljenjeDto getOdeljenjeDezurni() {
        return odeljenjeDezurni;
    }

    public void setOdeljenjeDezurni(OdeljenjeDto odeljenjeDezurni) {
        this.odeljenjeDezurni = odeljenjeDezurni;
    }

    public OdeljenjeDto getPrimarnoOdljenje() {
        return primarnoOdljenje;
    }

    public void setPrimarnoOdljenje(OdeljenjeDto primarnoOdljenje) {
        this.primarnoOdljenje = primarnoOdljenje;
    }

    public List<ProceduraDto> getProcedure() {
        return procedure;
    }

    public void setProcedure(List<ProceduraDto> procedure) {
        this.procedure = procedure;
    }

    public List<PacijentKartonDto> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<PacijentKartonDto> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public List<ReceptDto> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<ReceptDto> recepti) {
        this.recepti = recepti;
    }

    public List<CovidListaDto> getCovidListe() {
        return covidListe;
    }

    public void setCovidListe(List<CovidListaDto> covidListe) {
        this.covidListe = covidListe;
    }

    public LekarDto() {
    }

    public void setLekarId(int lekarId) {
        this.lekarId = lekarId;
    }

    public int getLekarId() {
        return this.lekarId;
    }

    public void setSpecijalizacija(String specijalizacija) {
        this.specijalizacija = specijalizacija;
    }

    public String getSpecijalizacija() {
        return this.specijalizacija;
    }
}