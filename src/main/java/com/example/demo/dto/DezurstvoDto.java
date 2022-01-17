package com.example.demo.dto;


import java.sql.Date;

public class DezurstvoDto {
    private int dezurstvoId;
    private Date datumPocetka;
    private Date datumKraja;
    private BolnicaZaposleniDto bolnicaZaposleniDto;

    public DezurstvoDto() {
    }

    public BolnicaZaposleniDto getBolnicaDto() {
        return bolnicaZaposleniDto;
    }

    public void setBolnicaDto(BolnicaZaposleniDto bolnicaZaposleniDto) {
        this.bolnicaZaposleniDto = bolnicaZaposleniDto;
    }

    public void setDezurstvoId(int dezurstvoId) {
        this.dezurstvoId = dezurstvoId;
    }

    public int getDezurstvoId() {
        return this.dezurstvoId;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumPocetka() {
        return this.datumPocetka;
    }

    public void setDatumKraja(Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    public Date getDatumKraja() {
        return this.datumKraja;
    }


}