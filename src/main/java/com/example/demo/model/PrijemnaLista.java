package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table()
public class PrijemnaLista {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long prijemnaListaId;
    private Date datumPrijema;
    private Date datumOtpustaja;
    private Integer pacijentId;
    private Integer sobaId;
    private Integer zaposleniId;
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

    public Integer getSobaId() {
        return sobaId;
    }

    public void setSobaId(Integer sobaId) {
        this.sobaId = sobaId;
    }

    public Integer getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Integer zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public List<PacijentKarton> getPacijent() {
        return pacijent;
    }

    public void setPacijent(List<PacijentKarton> pacijent) {
        this.pacijent = pacijent;
    }


}
