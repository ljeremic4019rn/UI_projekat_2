package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table()
public class PrijemnaLista {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long prijemnaListaId;
    private Date datumPrijema;
    private Date datumOtpustaja;
    private Integer pacijentId;
    private Long bolnicaZaposleniId;
    @OneToMany
    private List<PacijentKarton> pacijent;
    @ManyToOne
    private Soba soba;


    public Soba getSoba() {
        return soba;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
    }

    public Long getPrijemnaListaId() {
        return prijemnaListaId;
    }

    public void setPrijemnaListaId(Long prijemnaListaId) {
        this.prijemnaListaId = prijemnaListaId;
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



    public Long getBolnicaZaposleniId() {
        return bolnicaZaposleniId;
    }

    public void setBolnicaZaposleniId(Long zaposleniId) {
        this.bolnicaZaposleniId = zaposleniId;
    }

    public List<PacijentKarton> getPacijent() {
        return pacijent;
    }

    public void setPacijent(List<PacijentKarton> pacijent) {
        this.pacijent = pacijent;
    }


}
