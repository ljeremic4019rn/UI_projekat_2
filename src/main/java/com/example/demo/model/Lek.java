package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Lek {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long lekId;
    private String grupa;
    private String naziv;
    private String sastav;
    private String tip;
    private Date datumIsteka;
    private Date datumProizvodnje;
    @OneToMany
    private List<Recept> recepti;
    @ManyToMany
    private List<CovidLista> covidListe;

    public Long getLekId() {
        return lekId;
    }

    public void setLekId(Long lekId) {
        this.lekId = lekId;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSastav() {
        return sastav;
    }

    public void setSastav(String sastav) {
        this.sastav = sastav;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Date getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public Date getDatumProizvodnje() {
        return datumProizvodnje;
    }

    public void setDatumProizvodnje(Date datumProizvodnje) {
        this.datumProizvodnje = datumProizvodnje;
    }

    public List<Recept> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<Recept> recepti) {
        this.recepti = recepti;
    }

    public List<CovidLista> getCovidListe() {
        return covidListe;
    }

    public void setCovidListe(List<CovidLista> covidListe) {
        this.covidListe = covidListe;
    }
}
