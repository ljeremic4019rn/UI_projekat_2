package com.example.demo.dto;

import java.util.List;

public class OdeljenjeDto{
    private int odeljenjeId;
    private String ime;
    private BolnicaZaposleniDto bolnica;
    private List<BlokDto> blokovi;
    private List<LekarDto> lekar;
    private LekarDto dezurni;
    private LekarDto primarniLekar;

    public BolnicaZaposleniDto getBolnica() {
        return bolnica;
    }

    public void setBolnica(BolnicaZaposleniDto bolnica) {
        this.bolnica = bolnica;
    }

    public List<BlokDto> getBlokovi() {
        return blokovi;
    }

    public void setBlokovi(List<BlokDto> blokovi) {
        this.blokovi = blokovi;
    }

    public List<LekarDto> getLekar() {
        return lekar;
    }

    public void setLekar(List<LekarDto> lekar) {
        this.lekar = lekar;
    }

    public LekarDto getDezurni() {
        return dezurni;
    }

    public void setDezurni(LekarDto dezurni) {
        this.dezurni = dezurni;
    }

    public LekarDto getPrimarniLekar() {
        return primarniLekar;
    }

    public void setPrimarniLekar(LekarDto primarniLekar) {
        this.primarniLekar = primarniLekar;
    }

    public OdeljenjeDto() {
    }

    public void setOdeljenjeId(int odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public int getOdeljenjeId() {
        return this.odeljenjeId;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }


}