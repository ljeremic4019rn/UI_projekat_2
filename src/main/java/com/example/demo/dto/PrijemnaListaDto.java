package com.example.demo.dto;


import java.sql.Date;
import java.util.List;

public class PrijemnaListaDto  {
    private int prijemnaListaId;
    private Date datumPrijema;
    private Date datumOtpustaja;
    private Integer pacijentId;
    private Long zaposleniId;
    private List<PacijentKartonDto> pacijenti;
    private SobaDto soba;

    public List<PacijentKartonDto> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<PacijentKartonDto> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public SobaDto getSoba() {
        return soba;
    }

    public void setSoba(SobaDto soba) {
        this.soba = soba;
    }

    public PrijemnaListaDto() {
    }

    public void setPrijemnaListaId(int prijemnaListaId) {
        this.prijemnaListaId = prijemnaListaId;
    }

    public int getPrijemnaListaId() {
        return this.prijemnaListaId;
    }

    public void setDatumPrijema(Date datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public Date getDatumPrijema() {
        return this.datumPrijema;
    }

    public void setDatumOtpustaja(Date datumOtpustaja) {
        this.datumOtpustaja = datumOtpustaja;
    }

    public Date getDatumOtpustaja() {
        return this.datumOtpustaja;
    }

    public void setPacijentId(Integer pacijentId) {
        this.pacijentId = pacijentId;
    }

    public Integer getPacijentId() {
        return this.pacijentId;
    }


    public void setZaposleniId(Long zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public Long getZaposleniId() {
        return this.zaposleniId;
    }
}