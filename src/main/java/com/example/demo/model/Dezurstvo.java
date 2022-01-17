package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Dezurstvo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long dezurstvoId;
    private Date datumPocetka;
    private Date datumKraja;
    @ManyToOne
    private BolnicaZaposleni bolnicaZaposleni;

    public Long getDezurstvoId() {
        return dezurstvoId;
    }

    public void setDezurstvoId(Long dezurstvoId) {
        this.dezurstvoId = dezurstvoId;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumKraja() {
        return datumKraja;
    }

    public void setDatumKraja(Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    public BolnicaZaposleni getBolnica() {
        return bolnicaZaposleni;
    }

    public void setBolnica(BolnicaZaposleni bolnicaZaposleni) {
        this.bolnicaZaposleni = bolnicaZaposleni;
    }
}
