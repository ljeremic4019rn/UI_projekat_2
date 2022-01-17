package com.example.demo.dto;


import java.sql.Date;
import java.util.List;


public class CovidListaDto  {
    private int covidListaId;
    private Date datumPrijema;
    private Date datumOtpustaja;
    private Long pacijentId;

    private PacijentKartonDto pacijentKarton;
    private List<LekarDto> lekovi;

    public CovidListaDto() {
    }

    public PacijentKartonDto getPacijentKarton() {
        return pacijentKarton;
    }

    public void setPacijentKarton(PacijentKartonDto pacijentKarton) {
        this.pacijentKarton = pacijentKarton;
    }

    public List<LekarDto> getLekovi() {
        return lekovi;
    }

    public void setLekovi(List<LekarDto> lekovi) {
        this.lekovi = lekovi;
    }

    public void setCovidListaId(int covidListaId) {
        this.covidListaId = covidListaId;
    }

    public int getCovidListaId() {
        return this.covidListaId;
    }

    public void setDatumPrijema(Date datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public Date getDatumPrijema() {
        return this.datumPrijema;
    }

    public void setDatumOtpustaja(Date datumOtpustaja) {
        this.datumOtpustaja = datumOtpustaja;
    }

    public Date getDatumOtpustaja() {
        return this.datumOtpustaja;
    }

    public void setPacijentId(Long pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Long getPacijentId() {
        return this.pacijentId;
    }
}