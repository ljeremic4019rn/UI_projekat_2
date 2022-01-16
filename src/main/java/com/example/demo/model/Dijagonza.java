package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Dijagonza {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long dijagnozaId;
    private String sifra;
    private String ime;
    private Date datumPocetka;
    private Date datumZavrsetka;
    private Integer pacijentId;

    public Long getDijagnozaId() {
        return dijagnozaId;
    }

    public void setDijagnozaId(Long dijagnozaId) {
        this.dijagnozaId = dijagnozaId;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumZavrsetka() {
        return datumZavrsetka;
    }

    public void setDatumZavrsetka(Date datumZavrsetka) {
        this.datumZavrsetka = datumZavrsetka;
    }

    public Integer getPacijentId() {
        return pacijentId;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }


}
