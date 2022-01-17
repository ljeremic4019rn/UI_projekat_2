package com.example.demo.dto;

import java.util.List;

public class SestraDto  {
    private int sestraId;
    private Boolean licenca;
    private String pozicija;
    private BlokDto blok;
    private List<ProceduraDto> procedure;
    private List<CovidListaDto> covidListe;

    public BlokDto getBlok() {
        return blok;
    }

    public void setBlok(BlokDto blok) {
        this.blok = blok;
    }

    public List<ProceduraDto> getProcedure() {
        return procedure;
    }

    public void setProcedure(List<ProceduraDto> procedure) {
        this.procedure = procedure;
    }

    public List<CovidListaDto> getCovidListe() {
        return covidListe;
    }

    public void setCovidListe(List<CovidListaDto> covidListe) {
        this.covidListe = covidListe;
    }

    public SestraDto() {
    }

    public void setSestraId(int sestraId) {
        this.sestraId = sestraId;
    }

    public int getSestraId() {
        return this.sestraId;
    }

    public void setLicenca(Boolean licenca) {
        this.licenca = licenca;
    }

    public Boolean getLicenca() {
        return this.licenca;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public String getPozicija() {
        return this.pozicija;
    }
}