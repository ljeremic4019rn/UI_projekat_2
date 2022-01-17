package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Odeljenje {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long odeljenjeId;
    private String ime;
    @OneToOne
    private BolnicaZaposleni bolnicaZaposleni;
    @OneToMany
    private List<Blok> blokovi;
    @ManyToMany
    private List<Lekar> lekari;
    @OneToOne
    private Lekar lekarDezurni;
    @OneToOne
    private Lekar primarniLekar;

    public Lekar getPrimarniLekar() {
        return primarniLekar;
    }

    public void setPrimarniLekar(Lekar primarniLekar) {
        this.primarniLekar = primarniLekar;
    }

    public Long getOdeljenjeId() {
        return odeljenjeId;
    }

    public void setOdeljenjeId(Long odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public BolnicaZaposleni getBolnica() {
        return bolnicaZaposleni;
    }

    public void setBolnica(BolnicaZaposleni bolnicaZaposleni) {
        this.bolnicaZaposleni = bolnicaZaposleni;
    }

    public List<Blok> getBlokovi() {
        return blokovi;
    }

    public void setBlokovi(List<Blok> blokovi) {
        this.blokovi = blokovi;
    }

    public List<Lekar> getLekari() {
        return lekari;
    }

    public void setLekari(List<Lekar> lekari) {
        this.lekari = lekari;
    }

    public Lekar getLekarDezurni() {
        return lekarDezurni;
    }

    public void setLekarDezurni(Lekar lekarDezurni) {
        this.lekarDezurni = lekarDezurni;
    }

}
