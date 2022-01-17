package com.example.demo.dto;


import java.sql.Date;
import java.util.List;

public class LekDto  {
    private int lekId;
    private String grupa;
    private String naziv;
    private String sastav;
    private String tip;
    private Date datumIsteka;
    private Date datumProizvodnje;

    private List<ReceptDto> recepti;
    private List<CovidListaDto> covidLista;

    public LekDto() {
    }

    public List<CovidListaDto> getCovidLista() {
        return covidLista;
    }

    public void setCovidLista(List<CovidListaDto> covidLista) {
        this.covidLista = covidLista;
    }

    public List<ReceptDto> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<ReceptDto> recepti) {
        this.recepti = recepti;
    }

    public void setLekId(int lekId) {
        this.lekId = lekId;
    }

    public int getLekId() {
        return this.lekId;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getGrupa() {
        return this.grupa;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setSastav(String sastav) {
        this.sastav = sastav;
    }

    public String getSastav() {
        return this.sastav;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public Date getDatumIsteka() {
        return this.datumIsteka;
    }

    public void setDatumProizvodnje(Date datumProizvodnje) {
        this.datumProizvodnje = datumProizvodnje;
    }

    public Date getDatumProizvodnje() {
        return this.datumProizvodnje;
    }
}