package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table()
public class CovidLista {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long covidListaId;

    private Date datumPrijema;

    private Date datumOtpustaja;

    private Integer pacijentId;

    @ManyToOne
    private PacijentKarton pacijent;
    @ManyToMany
    private List<Lek> covidLek;

    public Long getCovidListaId() {
        return covidListaId;
    }

    public void setCovidListaId(Long covidListaId) {
        this.covidListaId = covidListaId;
    }

    public Date getDatumPrijema() {
        return datumPrijema;
    }

    public void setDatumPrijema(Date datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public Date getDatumOtpustaja() {
        return datumOtpustaja;
    }

    public void setDatumOtpustaja(Date datumOtpustaja) {
        this.datumOtpustaja = datumOtpustaja;
    }

    public Integer getPacijentId() {
        return pacijentId;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public PacijentKarton getPacijent() {
        return pacijent;
    }

    public void setPacijent(PacijentKarton pacijent) {
        this.pacijent = pacijent;
    }

    public List<Lek> getCovidLek() {
        return covidLek;
    }

    public void setCovidLek(List<Lek> covidLek) {
        this.covidLek = covidLek;
    }

}
