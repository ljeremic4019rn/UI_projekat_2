package com.example.demo.dto;


import java.sql.Date;


public class DijagonzaDto  {
    private int dijagnozaId;
    private String sifra;
    private String ime;
    private Date datumPocetka;
    private Date datumZavrsetka;
    private Long pacijentId;

    public DijagonzaDto() {
    }

    public void setDijagnozaId(int dijagnozaId) {
        this.dijagnozaId = dijagnozaId;
    }

    public int getDijagnozaId() {
        return this.dijagnozaId;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getSifra() {
        return this.sifra;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumPocetka() {
        return this.datumPocetka;
    }

    public void setDatumZavrsetka(Date datumZavrsetka) {
        this.datumZavrsetka = datumZavrsetka;
    }

    public Date getDatumZavrsetka() {
        return this.datumZavrsetka;
    }

    public void setPacijentId(Long pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Long getPacijentId() {
        return this.pacijentId;
    }
}